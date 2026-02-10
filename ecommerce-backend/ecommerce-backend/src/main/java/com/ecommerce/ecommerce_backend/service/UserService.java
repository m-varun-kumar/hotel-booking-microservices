package com.ecommerce.ecommerce_backend.service;


import com.ecommerce.ecommerce_backend.model.AppUser;
import com.ecommerce.ecommerce_backend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public AppUser save(AppUser user) {
        return userRepository.save(user);
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }


    public Optional<AppUser> getById(Long userId) {
        return userRepository.findById(userId);
    }
}
