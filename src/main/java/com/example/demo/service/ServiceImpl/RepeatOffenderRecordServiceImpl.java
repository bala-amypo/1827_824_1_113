// package com.example.demo.service.ServiceImpl;

// import java.util.List;

// import org.springframework.stereotype.Service;

// import com.example.demo.entity.RepeatOffenderRecord;
// import com.example.demo.repository.RepeatOffenderRecordRepository;
// import com.example.demo.service.RepeatOffenderRecordService;

// @Service
// public class RepeatOffenderRecordServiceImpl
//         implements RepeatOffenderRecordService {

//     private final RepeatOffenderRecordRepository repository;

//     public RepeatOffenderRecordServiceImpl(
//             RepeatOffenderRecordRepository repository) {
//         this.repository = repository;
//     }

//     @Override
//     public RepeatOffenderRecord save(RepeatOffenderRecord record) {
//         return repository.save(record);
//     }

//     @Override
//     public RepeatOffenderRecord findById(Long id) {
//         return repository.findById(id).orElse(null);
//     }

//     @Override
//     public List<RepeatOffenderRecord> findAll() {
//         return repository.findAll();
//     }

//     @Override
//     public List<RepeatOffenderRecord> findByStudentId(Long studentId) {
//         return repository.findByStudentId(studentId);
//     }
// }
