package com.example.user.services.controller;

import com.example.user.services.model.User;
import com.example.user.services.services.UserServices;
import com.example.user.services.valueObject.RestTempletVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServices userServices;

    @PostMapping("/")
    public User createUser(@RequestBody User user){
        return userServices.createUser(user);
    }

    @GetMapping("/{userid}")
    public RestTempletVO getUserWithDepartment(@PathVariable int userid){
        return userServices.getUserWithDepartment(userid);
    }
}
