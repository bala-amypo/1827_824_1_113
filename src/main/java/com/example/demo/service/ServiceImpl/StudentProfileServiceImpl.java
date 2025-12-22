package com.example.demo.service.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentProfile;
import com.example.demo.repository.StudentProfileRepository;
import com.example.demo.service.StudentProfileService;

@Service
public class StudentProfileServiceImpl implements StudentProfileService {

    private final StudentProfileRepository repository;

    public StudentProfileServiceImpl(StudentProfileRepository repository) {
        this.repository = repository;
    }

    @Override
    public StudentProfile save(StudentProfile studentProfile) {
        return repository.save(studentProfile);
    }

    @Override
    public StudentProfile findById(Long id) {
        Optional<StudentProfile> optionalStudent = repository.findById(id);
        return optionalStudent.orElse(null);
    }

    @Override
    public List<StudentProfile> findAll() {
        return repository.findAll();
    }

    @Override
    public void updateRepeatStatus(Long studentId) {
        Optional<StudentProfile> optionalStudent = repository.findById(studentId);
        if (optionalStudent.isPresent()) {
            StudentProfile student = optionalStudent.get();
            student.setRepeatOffender(true);
            repository.save(student);
        }
    }
}
