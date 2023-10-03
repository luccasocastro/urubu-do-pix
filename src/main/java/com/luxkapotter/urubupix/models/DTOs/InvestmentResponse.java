package com.luxkapotter.urubupix.models.DTOs;

import java.time.LocalDate;

public record InvestmentResponse(Long id, Double value, LocalDate depositDate, LocalDate dueDate, UserResponse user) {
    
}
