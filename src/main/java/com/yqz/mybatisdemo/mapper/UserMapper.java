package com.yqz.mybatisdemo.mapper;


import com.yqz.mybatisdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {


      List<User> getUserList();

      User getUserById(Integer id);

      int addUser(User user);
}
