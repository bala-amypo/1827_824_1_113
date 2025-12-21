package com.example.demo.controller;

import com.example.demo.entity.EvidenceRecord;
import com.example.demo.service.EvidenceRecordService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/evidence")
@Tag(name = "Evidence Records")
public class EvidenceRecordController {

    private final EvidenceRecordService service;

    public EvidenceRecordController(EvidenceRecordService service) {
        this.service = service;
    }

    @PostMapping
    public EvidenceRecord submitEvidence(@RequestBody EvidenceRecord evidence) {
        return service.submitEvidence(evidence);
    }

    @GetMapping("/case/{caseId}")
    public List<EvidenceRecord> getEvidenceByCase(@PathVariable Long caseId) {
        return service.getEvidenceByCase(caseId);
    }

    @GetMapping("/{id}")
    public EvidenceRecord getEvidenceById(@PathVariable Long id) {
        return service.getEvidenceById(id);
    }

    @GetMapping
    public List<EvidenceRecord> getAllEvidence() {
        return service.getAllEvidence();
    }
}
