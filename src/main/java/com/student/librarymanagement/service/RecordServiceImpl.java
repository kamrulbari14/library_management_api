package com.student.librarymanagement.service;

import com.student.librarymanagement.entity.Record;
import com.student.librarymanagement.repository.RecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecordServiceImpl implements RecordService {
    private RecordRepository recordRepository;

    public RecordServiceImpl(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @Override
    public List<Record> recordList() {
        return recordRepository.findAll();
    }

    @Override
    public Record saveRecord(Record record) {
        return recordRepository.save(record);
    }

    @Override
    public Record getById(Integer id) {
        Optional<Record> result = recordRepository.findById(id);
        Record record;
        if (result.isPresent()){
            record =result.get();
        }

        else {
            throw new RuntimeException("Record not found in id " + id);
        }
        return record;
    }

}
