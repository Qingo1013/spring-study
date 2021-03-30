package cn.qqa.tests;

import cn.qqa.config.MyConfig;
import cn.qqa.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        //如果完全使用配置类方式，我们就只能通过AnnotationConfig上下文来获取容器，通过配置类的class对象加载！
        //参数为配置类.class
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        //参数为配置类中的方法名
        User getUser = (User) context.getBean("getUser");
        System.out.println(getUser.getName());
    }

}
