// package com.example.demo.service;

// import java.util.List;

// import org.springframework.stereotype.Service;

// import com.example.demo.entity.EvidenceRecord;
// import com.example.demo.repository.EvidenceRecordRepository;

// @Service
// public class EvidenceRecordServiceImpl implements EvidenceRecordService {

//     private final EvidenceRecordRepository repository;

//     public EvidenceRecordServiceImpl(EvidenceRecordRepository repository) {
//         this.repository = repository;
//     }

//     @Override
//     public EvidenceRecord submitEvidence(EvidenceRecord evidence) {
//         return repository.save(evidence);
//     }

//     @Override
//     public List<EvidenceRecord> getEvidenceByCase(Long caseId) {
//         return repository.findByIntegrityCaseId(caseId);
//     }

//     @Override
//     public EvidenceRecord getEvidenceById(Long id) {
//         return repository.findById(id).orElse(null);
//     }

//     @Override
//     public List<EvidenceRecord> getAllEvidence() {
//         return repository.findAll();
//     }
// }
