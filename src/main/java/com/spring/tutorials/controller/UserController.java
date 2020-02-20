package com.spring.tutorials.controller;

import com.spring.tutorials.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public ModelAndView getCountries() {
        return new ModelAndView("user");
    }

}
