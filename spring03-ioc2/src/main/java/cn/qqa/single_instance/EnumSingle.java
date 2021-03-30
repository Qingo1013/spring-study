package cn.qqa.single_instance;

import java.lang.reflect.Constructor;

//enum是一个什么？
//enum本身也是一个Class类
public enum EnumSingle {
    INSTANCE;
    public EnumSingle getInstance(){
        return INSTANCE;
    }
}

class Test{

    public static void main(String[] args) throws Exception {
        EnumSingle instance = EnumSingle.INSTANCE;

        Constructor<EnumSingle> declaredConstructor = EnumSingle.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        EnumSingle enumSingle = declaredConstructor.newInstance();

        //java.lang.NoSuchMethodException: cn.qqa.single_instance.EnumSingle.<init>()
        System.out.println(instance.hashCode());
        System.out.println(enumSingle.hashCode());


    }
}
