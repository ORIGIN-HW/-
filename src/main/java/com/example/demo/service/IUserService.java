package com.example.demo.service;
import com.example.demo.entity.user;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname BookService
 * @Description TODO
 * @Date 2020/2/28 16:51
 * @Created by x1c
 */

public interface IUserService {
    /**
     * description: 根据用户名获取用户
     */
    //查询所有
   List<user> userList();

}
