package cn.qqa.tests;

import cn.qqa.pojo.Student;
import cn.qqa.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");

        System.out.println(student);

    }

    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user =  context.getBean("user2",User.class);
        User user2 =  context.getBean("user2",User.class);
        System.out.println(user==user2);
    }



}
