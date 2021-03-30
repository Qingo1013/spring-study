package cn.qqa.demo2;
//开发原则：尽量不修改源代码
//单一职责原则
//1.改动原有的业务代码在公司中是大忌！

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        //System.out.println("日志：使用了add方法！");
        System.out.println("增加了一个用户！");
    }

    @Override
    public void delete() {
        //System.out.println("日志：使用了delete方法！");
        System.out.println("删除了一个用户！");
    }

    @Override
    public void update() {
        //System.out.println("日志：使用了update方法！");
        System.out.println("修改了一个用户！");
    }

    @Override
    public void query() {
        //System.out.println("日志：使用了query方法！");
        System.out.println("查询了一个用户！");
    }
}
