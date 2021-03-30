package cn.qqa.tests;

import cn.qqa.dao.UserDaoSqlServerImpl;
import cn.qqa.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {
    @Test
    public void test(){
        //再也不用new对象了，获取ApplicationContext:拿到spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //容器在手，天下我有，需要什么，就直接get什么！
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");

        userServiceImpl.getUser();
    }
}
