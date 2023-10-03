package com.luxkapotter.urubupix.models.DTOs;

import jakarta.validation.constraints.NotBlank;

public record UserRequest(
    @NotBlank String name,
    @NotBlank String email,
    @NotBlank String password
) {
    
}
