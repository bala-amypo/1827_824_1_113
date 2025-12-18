package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.EntityClass.IntegrityCase;

public interface IntegrityCaseRepository extends JpaRepository<IntegrityCase, Long> {

}
