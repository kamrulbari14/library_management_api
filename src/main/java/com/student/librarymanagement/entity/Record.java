package com.student.librarymanagement.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String roll;
    private String issueDate;
    private String returnDate;
    private String bookName;
    private String status;
    private String fineStatus;
    private String fine;
}
