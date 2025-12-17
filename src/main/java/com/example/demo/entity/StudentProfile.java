package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;



@Entity

public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String studentId;

    private String name;
                       
    @Column(unique = true)
    private String email;

    private String program;

    private Integer yearLevel;

    private Boolean isRepeatOffender = false;

    private LocalDateTime createdAt;

    
    }

    
}