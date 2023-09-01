package com.example.personmanage.mapper;


import com.example.personmanage.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


//指定这是一个操作数据库的mapper
@Mapper
public interface UserMapper {

    List<User> findAll();
    User findUserById(int id);
    boolean addUser(User user);
    boolean deleteUserById(int id);
    boolean updateUser(User user);
}
