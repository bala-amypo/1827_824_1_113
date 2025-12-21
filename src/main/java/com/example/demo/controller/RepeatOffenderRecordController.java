package com.example.demo.controller;

import com.example.demo.entity.RepeatOffenderRecord;
import com.example.demo.service.RepeatOffenderRecordService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/repeat-offenders")
@Tag(name = "Repeat Offender Records")
public class RepeatOffenderRecordController {

    private final RepeatOffenderRecordService service;

    public RepeatOffenderRecordController(RepeatOffenderRecordService service) {
        this.service = service;
    }

    @PostMapping
    public RepeatOffenderRecord save(@RequestBody RepeatOffenderRecord record) {
        return service.save(record);
    }

    @GetMapping
    public List<RepeatOffenderRecord> getAll() {
        return service.findAll();
    }
}
