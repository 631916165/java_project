package com.example.personmanage.controller;


import com.example.personmanage.entity.User;
import com.example.personmanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String start() {
        System.out.println("running.............");
        return "启动了";
    }

    @GetMapping("/findall")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/findid/{id}")
    public User findUserById(@PathVariable int id) {
        return userService.findUserById(id);
    }

    @PostMapping("/adduser")
    public boolean addUser(@PathVariable User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/deleteuser/{id}")
    public boolean deleteUserById(@PathVariable int id) {
        return userService.deleteUserById(id);
    }

    @PostMapping("/updateuser")
    public boolean updateUser(@PathVariable User user) {
        return userService.updateUser(user);
    }


}
