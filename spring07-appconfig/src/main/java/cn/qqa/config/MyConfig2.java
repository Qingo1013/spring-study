package cn.qqa.config;

import cn.qqa.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//等价于 <beans>
//也会被容器接管，注册到容器中，他本来就是一个@Component
//@Configuration代表这是一个配置类，和beans.xml类似
@Configuration
@ComponentScan("cn.qqa.pojo")
public class MyConfig2 {

    //注册一个bean，就相当于我们之前写的一个bean标签
    //这个方法的名字就相当于bean标签中的id属性
    //这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User getUser(){
        //就是要返回注入到bean的对象
        return new User();
    }
}
