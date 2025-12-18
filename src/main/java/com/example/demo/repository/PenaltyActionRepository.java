package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.EntityClass.PenaltyAction;

public interface PenaltyActionRepository extends JpaRepository<PenaltyAction, Long> {
    
}


