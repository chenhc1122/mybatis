package com.yqz.mybatisdemo.controller;

import com.yqz.mybatisdemo.pojo.User;
import com.yqz.mybatisdemo.service.UserService;
import com.yqz.mybatisdemo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @GetMapping("/getUser")
    public List<User> getUser(){
        System.out.println("------------我进来了------------------");
        return userService.getUserList();
    }

    @PostMapping("/getUser/{id}")
     public User getUserById(@PathVariable("id") Integer id){
        System.out.println(id);
      return   userService.getUserById(id);
     }

     @PostMapping("/adduser")
    public void addUser(User user){
        userService.addUser(user);
         System.out.println(user);
     }

}
