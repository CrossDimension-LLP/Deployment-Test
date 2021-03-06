package com.octopus.microservicetest1.service.implementation;

import com.octopus.microservicetest1.model.User;
import com.octopus.microservicetest1.repository.IUserRepository;
import com.octopus.microservicetest1.service.interfaces.IUserService;
import com.octopus.nucleus.service.interfaces.IGenericUtilityInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService implements IUserService {
    /** Service implementation */

    @Autowired
    private IUserRepository userRepository;




    @Override
    public User createUser(User user) {
        userRepository.save(user);
        return user;
    }
}
