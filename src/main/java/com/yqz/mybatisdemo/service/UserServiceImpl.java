package com.yqz.mybatisdemo.service;

import com.yqz.mybatisdemo.mapper.UserMapper;
import com.yqz.mybatisdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {
    @Autowired
    private UserMapper userMapper;
    public List<User> getUserList(){
        System.out.println("-----------get all user---------------");
        return userMapper.getUserList();
    }

    public User getUserById(Integer id){
        return userMapper.getUserById(id);
    }

    public void addUser(User user){
        userMapper.addUser(user);
    }
}
