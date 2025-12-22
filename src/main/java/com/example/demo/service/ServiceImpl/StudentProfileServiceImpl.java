package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.StudentProfile;
import com.example.demo.repository.StudentProfileRepository;

@Service
public class StudentProfileServiceImpl implements StudentProfileService {

    private final StudentProfileRepository repository;

    public StudentProfileServiceImpl(StudentProfileRepository repository) {
        this.repository = repository;
    }

    @Override
    public StudentProfile createStudent(StudentProfile dto) {
        return repository.save(dto);
    }

    @Override
    public StudentProfile getStudentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<StudentProfile> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public void updateRepeatOffenderStatus(Long studentId) {
        StudentProfile student = repository.findById(studentId).orElse(null);
        if (student != null) {
            student.setRepeatOffender(true);
            repository.save(student);
        }
    }
}
