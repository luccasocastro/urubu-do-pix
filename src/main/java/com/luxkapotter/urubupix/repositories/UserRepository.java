package com.luxkapotter.urubupix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luxkapotter.urubupix.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
