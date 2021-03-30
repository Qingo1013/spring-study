package cn.qqa.service;

import cn.qqa.dao.UserDao;
import cn.qqa.dao.UserDaoImpl;
import cn.qqa.dao.UserDaoMysqlImpl;
import cn.qqa.dao.UserDaoOracleImpl;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class UserServiceImpl implements UserService {
    private UserDao userDao;


    //利用setter进行动态实现值的注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
