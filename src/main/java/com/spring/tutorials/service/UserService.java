package com.spring.tutorials.service;


import com.spring.tutorials.entity.User;
import com.spring.tutorials.repository.UserRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class UserService {


    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public  Iterable<User>  getAllUsers(){
        return repository.findAll();
    }

    public void save(User u){
        repository.save(u);
    }
}
