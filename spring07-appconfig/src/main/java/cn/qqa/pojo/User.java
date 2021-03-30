package cn.qqa.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//此注解的意思就是说明这个类被IOC容器接管了，注册到了容器中
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }
    //属性注入值
    @Value("qqa")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
