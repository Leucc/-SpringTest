package com.example.springbootdemo1.service;


import com.example.springbootdemo1.pojo.User;
import com.example.springbootdemo1.pojo.dto.UserDto;
import com.example.springbootdemo1.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User add(UserDto username) {

        User userPojo = new User();

        BeanUtils.copyProperties(username,userPojo);

        return userRepository.save(userPojo);
    }
}
