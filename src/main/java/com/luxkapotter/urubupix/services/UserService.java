package com.luxkapotter.urubupix.services;

import org.springframework.stereotype.Service;

import com.luxkapotter.urubupix.models.User;
import com.luxkapotter.urubupix.models.DTOs.UserRequest;
import com.luxkapotter.urubupix.repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(UserRequest obj){
        User user = new User(obj.name(), obj.email(), obj.password());
        return userRepository.save(user);
    }

    public User findById(Long id){
        return userRepository.findById(id).get();
    }
}
