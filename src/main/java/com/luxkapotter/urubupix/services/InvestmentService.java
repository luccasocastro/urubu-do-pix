package com.luxkapotter.urubupix.services;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.luxkapotter.urubupix.models.Investment;
import com.luxkapotter.urubupix.models.DTOs.InvestmentRequest;
import com.luxkapotter.urubupix.repositories.InvestmentRepository;
import com.luxkapotter.urubupix.repositories.UserRepository;

@Service
public class InvestmentService {
    private final InvestmentRepository investmentRepository;
    private final UserRepository userRepository;

    public InvestmentService(InvestmentRepository investmentRepository, UserRepository userRepository) {
        this.investmentRepository = investmentRepository;
        this.userRepository = userRepository;
    }

    public void create(InvestmentRequest obj, Long id){
        Investment investment = new Investment(obj.value(), LocalDate.now(), LocalDate.now().plusDays(30), userRepository.findById(id).get());
        investmentRepository.save(investment);
    }
}
