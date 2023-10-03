package com.luxkapotter.urubupix.models.DTOs;

import java.util.List;

import com.luxkapotter.urubupix.models.Investment;

public record UserResponse(Long id, String name, String email, List<Investment> investments) {
    
}
