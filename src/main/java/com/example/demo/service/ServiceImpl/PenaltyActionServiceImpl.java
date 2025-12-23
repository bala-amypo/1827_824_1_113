package com.example.demo.service.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.PenaltyAction;
import com.example.demo.repository.PenaltyActionRepository;
import com.example.demo.service.PenaltyActionService;

@Service
public class PenaltyActionServiceImpl implements PenaltyActionService {

    private final PenaltyActionRepository repository;

    public PenaltyActionServiceImpl(PenaltyActionRepository repository) {
        this.repository = repository;
    }

    @Override
    public PenaltyAction addPenalty(PenaltyAction penalty) {
        return repository.save(penalty);
    }

    @Override
    public List<PenaltyAction> getPenaltiesByCase(Long caseId) {
        return repository.findByIntegrityCase_Id(caseId);
    }

    @Override
    public PenaltyAction getPenaltyById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<PenaltyAction> getAllPenalties() {
        return repository.findAll();
    }
}
