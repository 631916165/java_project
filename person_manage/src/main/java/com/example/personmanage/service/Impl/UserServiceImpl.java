package com.example.personmanage.service.Impl;

import com.example.personmanage.entity.User;
import com.example.personmanage.mapper.UserMapper;
import com.example.personmanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findUserById(int id) {
        return userMapper.findUserById(id);
    }

    @Override
    public  boolean addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public boolean deleteUserById(int id) {
        return userMapper.deleteUserById(id);
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateUser(user);
    }
}
