// package com.example.demo.service;

// import java.util.List;

// import org.springframework.stereotype.Service;

// import com.example.demo.entity.RepeatOffenderRecord;
// import com.example.demo.repository.RepeatOffenderRecordRepository;

// @Service
// public class RepeatOffenderRecordServiceImpl implements RepeatOffenderRecordService {

//     private final RepeatOffenderRecordRepository repository;

//     public RepeatOffenderRecordServiceImpl(RepeatOffenderRecordRepository repository) {
//         this.repository = repository;
//     }

//     @Override
//     public RepeatOffenderRecord refreshRepeatOffenderData(Long studentId) {
//         return repository.findByStudentId(studentId);
//     }

//     @Override
//     public RepeatOffenderRecord getRecordByStudent(Long studentId) {
//         return repository.findByStudentId(studentId);
//     }

//     @Override
//     public List<RepeatOffenderRecord> getAllRepeatOffenders() {
//         return repository.findAll();
//     }
// }
