package cn.qqa.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class People {

    //这个对象可以为null
    //@Autowired(required = false)
    @Resource(name = "cat2")
    private Cat cat;
    //@Autowired
    //@Qualifier(value = "dog2")
    @Resource(name = "dog2")
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }



    public Dog getDog() {
        return dog;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
