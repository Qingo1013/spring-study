package cn.qqa.tests;

import cn.qqa.pojo.User;
import cn.qqa.pojo.User2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        User2 user2 = (User2) context.getBean("u5");
    }
}
