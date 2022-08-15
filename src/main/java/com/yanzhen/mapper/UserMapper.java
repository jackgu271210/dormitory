package com.yanzhen.mapper;

import com.yanzhen.entity.User;

import java.util.List;

public interface UserMapper {
    
    int create(User user);
    
    int delete(Integer id);
    
    int update(User user);
    
    List<User> query(User user);
    
    User detail(User user);
}
