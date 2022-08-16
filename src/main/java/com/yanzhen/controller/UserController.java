package com.yanzhen.controller;

import com.github.pagehelper.PageInfo;
import com.yanzhen.entity.User;
import com.yanzhen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping("create")
    public void create() {
        User user = new User();
        user.setUserName("admin");
        user.setName("admin");
        user.setPassword("123456");
        userService.create(user);
    }

    @GetMapping("delete")
    public void delete(Integer id) {;
        userService.delete(id);
    }

    @GetMapping("update")
    public void update() {
        User user = new User();
        user.setUserName("adminxxxxxxx");
        user.setName("adminxxxxxx");
        user.setPassword("123456xxxxx");
        user.setId(101);
        userService.update(user);
    }

    @GetMapping("detail")
    public User detail(Integer id) {;
        return userService.detail(id);
    }

    @GetMapping("query")
    public PageInfo<User> query(User user) {;
        return userService.query(user);
    }
}
