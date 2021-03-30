package cn.qqa.single_instance;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * 懒汉式
 *  道高一尺，魔高一丈
 */
public class LazyMan {
    //红绿灯
    private static boolean qqa = false;


    private LazyMan(){
        synchronized (LazyMan.class){
            //用反射获得多个对象
            if(qqa==false){
                qqa=true;
            }else{
                throw new RuntimeException("不要试图通过反射破坏单例模式的异常！");
            }
/*          一个用getInstance，另一个用反射
            if(lazyMan!=null){
                throw new RuntimeException("不要试图通过反射破坏单例模式的异常！");
            }*/
        }

        System.out.println(Thread.currentThread().getName() + "ok");
    }

    private volatile static LazyMan lazyMan;

    //双重检测锁模式的懒汉式单例 ---> DCL懒汉式
    public static LazyMan getInstance(){
        if(lazyMan==null){
            synchronized (LazyMan.class){
                if(lazyMan==null){
                    //不是原子性操作
                    lazyMan = new LazyMan();
                    /**
                     * 1.分配内存空间
                     * 2.执行构造方法，初始化对象
                     * 3.把这个对象指向这个空间
                     *
                     * 指令重排可能导致的现象:
                     * 正确顺序：123
                     * 132 线程A执行到3，然后线程B会判断lazyMan!=null直接返回，这时对象还没有初始化
                     */
                }
            }
        }

        return lazyMan;
        //单线程下是单例的
    }

    //多线程并发
/*    public static void main(String[] args) {
        for(int i = 0 ; i < 10 ;i++){
            new Thread(()->{
                LazyMan.getInstance();
            }).start();
        }
    }*/

    //反射！可以破坏单例模式！
    public static void main(String[] args) throws Exception {
        //LazyMan instance = LazyMan.getInstance();
        //通过反射获得私有构造器
        Constructor<LazyMan> declaredConstructor = LazyMan.class.getDeclaredConstructor(null);
        //无视私有构造器
        declaredConstructor.setAccessible(true);
        //通过反射获得私有变量
        Field qqa = LazyMan.class.getDeclaredField("qqa");
        qqa.setAccessible(true);
        LazyMan lazyMan = declaredConstructor.newInstance();

        qqa.set(lazyMan,false);

        LazyMan lazyMan1 = declaredConstructor.newInstance();
        System.out.println(lazyMan1.hashCode());
        System.out.println(lazyMan.hashCode());
        System.out.println(lazyMan1==lazyMan);
    }
}
