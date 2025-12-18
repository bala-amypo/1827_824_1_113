package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.EntityClass.RepeatOffenderRecord;

public interface RepeatOffenderRecordRepository extends JpaRepository<RepeatOffenderRecord, Long> {
    
}


