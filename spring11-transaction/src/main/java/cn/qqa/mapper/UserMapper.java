package cn.qqa.mapper;

import cn.qqa.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    public List<User> selectUser();

    //添加一个用户
    public Integer addUser(User user);

    //删除一个用户
    public Integer deleteUser(Integer id);

}
