package com.yanzhen.service;

import com.yanzhen.entity.User;
import com.yanzhen.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserMapper userMapper;
    
    public int create(User user) {
        return userMapper.create(user);
    }
}
