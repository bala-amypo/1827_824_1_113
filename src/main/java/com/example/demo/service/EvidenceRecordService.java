package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.EvidenceRecord;

public interface EvidenceRecordService {

    EvidenceRecord saveEvidenceRecord(EvidenceRecord evidenceRecord);

    EvidenceRecord getEvidenceRecordById(Long id);

    List<EvidenceRecord> getAllEvidenceRecords();

    List<EvidenceRecord> getEvidenceRecordsByIntegrityCaseId(Long integrityCaseId);
}
