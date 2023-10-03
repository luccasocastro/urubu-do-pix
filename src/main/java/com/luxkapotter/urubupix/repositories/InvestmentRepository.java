package com.luxkapotter.urubupix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luxkapotter.urubupix.models.Investment;

@Repository
public interface InvestmentRepository extends JpaRepository<Investment, Long>{
    
}
