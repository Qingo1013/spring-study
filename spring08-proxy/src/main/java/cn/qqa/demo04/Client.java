package cn.qqa.demo04;

import cn.qqa.demo2.UserService;
import cn.qqa.demo2.UserServiceImpl;
import cn.qqa.demo04.ProxyInvocationHandler;

public class Client {
    //真实角色，无论如何都要有
    UserServiceImpl userService = new UserServiceImpl();

    //代理角色，不存在
    ProxyInvocationHandler pih = new ProxyInvocationHandler();

    //第一、代理一个接口,设置要代理的对象
    //动态生成代理类

}
