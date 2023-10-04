package com.luxkapotter.urubupix.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luxkapotter.urubupix.models.DTOs.InvestmentRequest;
import com.luxkapotter.urubupix.models.DTOs.UserResponse;
import com.luxkapotter.urubupix.repositories.UserRepository;
import com.luxkapotter.urubupix.services.InvestmentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/investments")
public class InvestmentController {
    private final InvestmentService investmentService;
    private final UserRepository userRepository;
    private final UserDTOMapper userDTOMapper;

    public InvestmentController(UserRepository userRepository, InvestmentService investmentService, UserDTOMapper userDTOMapper) {
        this.userRepository = userRepository;
        this.investmentService = investmentService;
        this.userDTOMapper = userDTOMapper;
    }

    @PostMapping("/{user_id}")
    public ResponseEntity<UserResponse> createInvestment(@RequestBody @Valid InvestmentRequest obj, @PathVariable Long user_id){
        investmentService.create(obj, user_id);
        return ResponseEntity.ok(userDTOMapper.toResponse(userRepository.findById(user_id).get()));
    }
    
}
