package com.yqz.mybatisdemo.service;

import com.yqz.mybatisdemo.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
     List<User> getUserList();
     User getUserById(Integer id);
     void addUser(User user);
}
