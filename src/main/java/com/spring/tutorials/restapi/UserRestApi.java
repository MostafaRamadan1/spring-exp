package com.spring.tutorials.restapi;


import com.spring.tutorials.entity.User;
import com.spring.tutorials.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestApi {

    private final UserRepository userRepository;

    public UserRestApi(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/addUser")
    public void addUser(@RequestBody User u){
        userRepository.save(u);
    }

    @GetMapping("/getAllUsers")
    public Iterable<User> getAllUser(){
       return userRepository.findAll();
    }
}
