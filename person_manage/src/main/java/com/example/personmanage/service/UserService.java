package com.example.personmanage.service;

import com.example.personmanage.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findUserById(int id);
    boolean addUser(User user);
    boolean deleteUserById(int id);
    boolean updateUser(User user);
}
