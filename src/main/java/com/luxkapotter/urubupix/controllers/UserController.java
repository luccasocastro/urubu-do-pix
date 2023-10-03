package com.luxkapotter.urubupix.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luxkapotter.urubupix.models.User;
import com.luxkapotter.urubupix.models.DTOs.UserRequest;
import com.luxkapotter.urubupix.models.DTOs.UserResponse;
import com.luxkapotter.urubupix.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest obj){
        User user = new User(obj.name(), obj.email(), obj.password());
        userRepository.save(user);
        return ResponseEntity.ok(new UserResponse(user.getId(), user.getName(), user.getEmail(), user.getInvestments()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> findById(@PathVariable Long id){
        User user = userRepository.findById(id).get();
        return ResponseEntity.ok(new UserResponse(user.getId(), user.getName(), user.getEmail(), user.getInvestments()));
    }
    
}
