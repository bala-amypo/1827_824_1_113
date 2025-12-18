package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.EntityClass.IntegrityCase;

public interface EvidenceRecordRepository extends JpaRepository<IntegrityCase, Long> {

}
