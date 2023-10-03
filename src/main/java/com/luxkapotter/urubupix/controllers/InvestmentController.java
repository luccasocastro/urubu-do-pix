package com.luxkapotter.urubupix.controllers;

import java.time.LocalDate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luxkapotter.urubupix.models.Investment;
import com.luxkapotter.urubupix.models.User;
import com.luxkapotter.urubupix.models.DTOs.InvestmentRequest;
import com.luxkapotter.urubupix.models.DTOs.UserResponse;
import com.luxkapotter.urubupix.repositories.InvestmentRepository;
import com.luxkapotter.urubupix.repositories.UserRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/investments")
public class InvestmentController {
    private InvestmentRepository investmentRepository;
    private UserRepository userRepository;

    public InvestmentController(InvestmentRepository investmentRepository, UserRepository userRepository) {
        this.investmentRepository = investmentRepository;
        this.userRepository = userRepository;
    }

    @PostMapping("/{user_id}")
    public ResponseEntity<UserResponse> createInvestment(@RequestBody @Valid InvestmentRequest obj, @PathVariable Long user_id){
        User user = userRepository.findById(user_id).get();
        Investment deposit = new Investment(obj.value(), LocalDate.now(), LocalDate.now().plusDays(30), user);
        investmentRepository.save(deposit);
        return ResponseEntity.ok(new UserResponse(user_id, user.getName(), user.getEmail(), user.getInvestments()));
    }
    
}
