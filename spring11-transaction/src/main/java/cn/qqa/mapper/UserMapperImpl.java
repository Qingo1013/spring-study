package cn.qqa.mapper;

import cn.qqa.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "qingo", "14486");
        mapper.addUser(user);
        mapper.deleteUser(3);
        return mapper.selectUser();
    }

    public Integer addUser(User user) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.addUser(user);
    }


    public Integer deleteUser(Integer id) {

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.deleteUser(3);
    }
}
