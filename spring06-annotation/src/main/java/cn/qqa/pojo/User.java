package cn.qqa.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//组件
@Component
//等价于<bean id="user" class="cn.qqa.pojo.User"/>
public class User {
    //相当于<property name="name" value="秦清澳"/>
    @Value("秦清澳")
    public String name;

}
