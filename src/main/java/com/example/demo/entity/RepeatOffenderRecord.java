package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;

@Entity
public class RepeatOffenderRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private StudentProfile studentProfile;

    private Integer totalCases;
    private LocalDate lastIncidentDate;

    private String flagSeverity;

    public RepeatOffenderRecord() {
    }

    public RepeatOffenderRecord(Long id,
                                StudentProfile studentProfile,
                                Integer totalCases,
                                LocalDate lastIncidentDate,
                                String flagSeverity) {
        this.id = id;
        this.studentProfile = studentProfile;
        this.totalCases = totalCases;
        this.lastIncidentDate = lastIncidentDate;
        this.flagSeverity = flagSeverity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StudentProfile getStudentProfile() {
        return studentProfile;
    }

    public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }

    public Integer getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(Integer totalCases) {
        this.totalCases = totalCases;
    }

    public LocalDate getLastIncidentDate() {
        return lastIncidentDate;
    }

    public void setLastIncidentDate(LocalDate lastIncidentDate) {
        this.lastIncidentDate = lastIncidentDate;
    }

    public String getFlagSeverity() {
        return flagSeverity;
    }

    public void setFlagSeverity(String flagSeverity) {
        this.flagSeverity = flagSeverity;
    }
}
