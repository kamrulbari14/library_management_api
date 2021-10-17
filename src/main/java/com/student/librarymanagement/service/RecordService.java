package com.student.librarymanagement.service;

import com.student.librarymanagement.entity.Record;

import java.util.List;

public interface RecordService {
    List<Record> recordList();

    Record saveRecord(Record record);

    Record getById(Integer id);
}
