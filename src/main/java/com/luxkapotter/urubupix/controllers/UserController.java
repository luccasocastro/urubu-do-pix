package com.luxkapotter.urubupix.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luxkapotter.urubupix.models.User;
import com.luxkapotter.urubupix.models.DTOs.UserRequest;
import com.luxkapotter.urubupix.models.DTOs.UserResponse;
import com.luxkapotter.urubupix.services.UserService;

@RestController
@RequestMapping(value = "/users")
@CrossOrigin(origins="*")
public class UserController {
    private final UserService userService;
    private final UserDTOMapper userDTOMapper;

    public UserController(UserService userService, UserDTOMapper userDTOMapper) {
        this.userService = userService;
        this.userDTOMapper = userDTOMapper;
    }

    @PostMapping
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest obj){
        User user = userService.create(obj);
        return ResponseEntity.ok(userDTOMapper.toResponse(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> findById(@PathVariable Long id){
        return ResponseEntity.ok(userDTOMapper.toResponse(userService.findById(id)));
    }
    
}
