package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(
    name = "student_profiles",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "studentId"),
        @UniqueConstraint(columnNames = "email")
    }
)
public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String studentId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    private String program;

    private Integer yearLevel;

    private Boolean isRepeatOffender = false;

    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "studentProfile")
    private List<IntegrityCase> integrityCases;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }

    // Getters and Setters
}