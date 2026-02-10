package com.ecommerce.ecommerce_backend.controller;


import com.ecommerce.ecommerce_backend.model.AppUser;
import com.ecommerce.ecommerce_backend.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public AppUser register(@RequestBody AppUser user) {
        return userService.save(user);
    }
}
