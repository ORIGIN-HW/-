package com.example.demo.service.impl;
import com.example.demo.entity.user;
import com.example.demo.mapping.UserMapper;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname BookServiceImpl
 * @Description TODO
 * @Date 2020/2/28 16:51
 * @Created by x1c
 */
@SuppressWarnings("ALL")
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<user> userList() {
        return userMapper.selectAll();
    }
}
