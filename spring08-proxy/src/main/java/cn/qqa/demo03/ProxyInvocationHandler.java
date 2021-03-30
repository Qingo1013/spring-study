package cn.qqa.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//我们用这个类，自动生成代理
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //动态生成并得到代理类
    public Object getProxy(){
        return   Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        //动态代理的机制，就是使用反射的机制实现！
        Object result = method.invoke(rent, args)   ;
        fare();
        contract();
        return result;
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房！");
    }

    //收房租
    public void fare(){
        System.out.println("中介收房租！");
    }

    //签合同
    public void contract(){
        System.out.println("签租赁合同！");
    }

}
