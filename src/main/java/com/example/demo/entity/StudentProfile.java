package com.example.demo.entity;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;



@Entity

public class StudentProfile {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
@Column(unique=true)
private String studentId;
private String name;
@Column(unique=true)
private String email;
private String program;
private Integer yearLevel;
private Boolean isRepeatOffender;
private LocalDateTime createdAt;

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getStudentId() {
    return studentId;
}

public void setStudentId(String studentId) {
    this.studentId = studentId;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getProgram() {
    return program;
}

public void setProgram(String program) {
    this.program = program;
}

public Integer getYearLevel() {
    return yearLevel;
}

public void setYearLevel(Interger yearLevel)
    this.yearLevel = yearLevel;
}

public Boolean getIsRepeatOffender() {
    return isRepeatOffender;
}

public void setIsRepeatOffender(Boolean isRepeatOffender) {
    this.isRepeatOffender = isRepeatOffender;
}

public LocalDateTime getCreatedAt() {
    return createdAt;
}

public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
}
 public StudentProfile(
                         String studentId,
                         String name,
                         String email,
                         String program,
                         Interger yearLevel,
                         Boolean isRepeatOffender
                         LocalDateTime createdAt) {
                              this.id = id;
                              this.studentId = studentId;
                               this.name = name;
                                this.email = email;
                                 this.program = program;
                                this.yearLevel = yearLevel;
                                 this.isRepeatOffender = isRepeatOffender;
                                  this.createdAt = createdAt;
       
    }
    public StudentProfile(){

    }
}