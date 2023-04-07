package com.UST.userservice.controller;

import com.UST.userservice.VO.ResponseTemplateVO;
import com.UST.userservice.entity.User;
import com.UST.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j

public class UserController {
    @Autowired
    private UserService userservice;
    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("inside the saveUser of UserController");
        return userservice.saveUser(user);
    }
    @GetMapping("/{id}")

    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("inside getUserWithDepartment of UserControl");
        return userservice.getUserWithDepartment(userId);
    }
}
