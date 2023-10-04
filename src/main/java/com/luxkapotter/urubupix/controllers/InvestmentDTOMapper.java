package com.luxkapotter.urubupix.controllers;

import org.springframework.stereotype.Component;

import com.luxkapotter.urubupix.models.Investment;
import com.luxkapotter.urubupix.models.DTOs.InvestmentResponse;

@Component
public class InvestmentDTOMapper {
    private final UserDTOMapper userDTOMapper;
    
    public InvestmentDTOMapper(UserDTOMapper userDTOMapper) {
        this.userDTOMapper = userDTOMapper;
    }

    public InvestmentResponse toResponse(Investment investment){
        return new InvestmentResponse(investment.getId(), investment.getValue(), investment.getDepositDate(), investment.getDueDate(), userDTOMapper.toResponse(investment.getUser()));
    }
}
