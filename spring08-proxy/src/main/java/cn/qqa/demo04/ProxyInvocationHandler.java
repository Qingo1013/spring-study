package cn.qqa.demo04;

import javax.swing.text.html.ObjectView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//等会我们会用这个类，自动生成代理
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //动态生成并得到代理类
    public Object getProxy(){
        return   Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的机制，就是使用反射的机制实现！
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }

    //日志
    public void log(String msg){
        System.out.println("[Debug]:调用了"+msg+"方法");
    }


}
