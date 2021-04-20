package com.Sakura.controller;

import com.Sakura.service.UserService;
import com.Sakura.bean.Result;
import com.Sakura.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 注册
     * @param user 参数封装
     * @return Result
     */
    @PostMapping(value = "/regist")
    public Result regist(User user){
        return userService.regist(user);
    }

    /**
     * 登录
     * @param user 参数封装
     * @return Result
     */
    @GetMapping(value = "/login")
    public Result login(User user){
        return userService.login(user);
    }
}

