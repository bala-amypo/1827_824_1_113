package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.StudentProfile;

public interface StudentProfileService {

    StudentProfile save(StudentProfile studentProfile);

    StudentProfile findById(Long id);

    List<StudentProfile> findAll();

    void updateRepeatStatus(Long studentId);
}
