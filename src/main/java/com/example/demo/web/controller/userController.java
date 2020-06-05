package com.example.demo.web.controller;

import com.example.demo.entity.user;
import com.example.demo.service.IUserService;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class userController {
    @Autowired
    IUserService userService;

    @RequestMapping("/index")
    public String loadIndex(Model model){
        List<user> users = userService.userList();
        model.addAttribute("users",users);
        return "index";
    }
}
