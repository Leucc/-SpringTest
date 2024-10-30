package com.example.springbootdemo1.controller;


import com.example.springbootdemo1.pojo.ResponseMessage;
import com.example.springbootdemo1.pojo.User;
import com.example.springbootdemo1.pojo.dto.UserDto;
import com.example.springbootdemo1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:3000")
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;


    //增加
    @PostMapping
    public ResponseMessage<User> add(@RequestBody UserDto user) {
        User uesrNew = userService.add(user);
        return ResponseMessage.success(uesrNew);
    }

    //查询

    //修改

    //删除
}
