package com.luxkapotter.urubupix.controllers;

import com.luxkapotter.urubupix.models.User;
import com.luxkapotter.urubupix.models.DTOs.UserRequest;
import com.luxkapotter.urubupix.models.DTOs.UserResponse;

public class UserDTOMapper {
    
    public UserResponse toResponse(User user){
        return new UserResponse(user.getId(), user.getName(), user.getEmail(), user.getInvestments());
    }

    public User toUser(UserRequest request){
        return new User(request.name(), request.email(), request.password());
    }
}
