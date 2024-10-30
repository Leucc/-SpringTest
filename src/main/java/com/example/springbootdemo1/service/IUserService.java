package com.example.springbootdemo1.service;

import com.example.springbootdemo1.pojo.User;
import com.example.springbootdemo1.pojo.dto.UserDto;

public interface IUserService {
    User add(UserDto username);
}
