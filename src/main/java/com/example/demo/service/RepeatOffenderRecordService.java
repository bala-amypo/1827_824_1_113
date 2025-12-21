package com.example.demo.service;

import com.example.demo.entity.RepeatOffenderRecord;
import java.util.List;

public interface RepeatOffenderRecordService {

    RepeatOffenderRecord addRecord(RepeatOffenderRecord record);

    List<RepeatOffenderRecord> getByStudent(Long studentId);

    List<RepeatOffenderRecord> getAll();
}
