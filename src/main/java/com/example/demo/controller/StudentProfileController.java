package com.example.demo.controller;

import com.example.demo.entity.StudentProfile;
import com.example.demo.service.StudentProfileService;
import io.swagger.v3.oas.annotations.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@Tag(name = "Student Profile Controller", description = "Student profile APIs")
public class StudentProfileController {

    private final StudentProfileService service;

    public StudentProfileController(StudentProfileService service) {
        this.service = service;
    }

    @PostMapping
    public StudentProfile createStudent(@RequestBody StudentProfile student) {
        return service.createStudent(student);
    }

    @GetMapping("/{id}")
    public StudentProfile getStudentById(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    @GetMapping
    public List<StudentProfile> getAllStudents() {
        return service.getAllStudents();
    }

    @PutMapping("/{studentId}/repeat-status")
    public void updateRepeatStatus(@PathVariable Long studentId) {
        service.updateRepeatOffenderStatus(studentId);
    }

    @GetMapping("/lookup/{studentId}")
    public StudentProfile findByStudentIdentifier(@PathVariable String studentId) {
        return service.findByStudentIdentifier(studentId);
    }
}
