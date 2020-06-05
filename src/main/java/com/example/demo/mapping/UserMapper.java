package com.example.demo.mapping;

import com.example.demo.entity.user;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname BookMapper
 * @Description TODO
 * @Date 2020/2/28 16:45
 * @Created by x1c
 */
public interface UserMapper {
    //查询所有
  List<user> selectAll();
}
