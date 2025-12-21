package com.example.demo.repository;

import com.example.demo.entity.PenaltyAction;
import com.example.demo.entity.IntegrityCase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PenaltyActionRepository extends JpaRepository<PenaltyAction, Long> {

    List<PenaltyAction> findByIntegrityCase(IntegrityCase integrityCase);
}
