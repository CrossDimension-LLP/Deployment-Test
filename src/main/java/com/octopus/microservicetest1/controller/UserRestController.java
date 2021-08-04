package com.octopus.microservicetest1.controller;


import com.octopus.microservicetest1.model.User;
import com.octopus.microservicetest1.repository.IUserRepository;
import com.octopus.microservicetest1.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class UserRestController {

    @Autowired
    private IUserService userService;

    @Autowired
    private IUserRepository userRepository;


    @PostMapping(value = "/user")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping(value = "/user")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
