package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Boolean isRepeatOffender;


    public Long getId() {
        return id;
    }

    public Boolean getRepeatOffender() {
        return isRepeatOffender;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setRepeatOffender(Boolean repeatOffender) {
        this.isRepeatOffender = repeatOffender;
    }
}
