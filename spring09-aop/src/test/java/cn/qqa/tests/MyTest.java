package cn.qqa.tests;

import cn.qqa.service.UserService;
import cn.qqa.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //动态代理，代理的是接口，所以返回值是接口:重点
        UserService userService = (UserService) context.getBean("userService");

        userService.add();
    }
}
