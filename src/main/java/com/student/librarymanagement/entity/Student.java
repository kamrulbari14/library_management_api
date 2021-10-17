package com.student.librarymanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer roll;
    private String session;
    private String email;
    private String mobile;
    private String department;

    @Lob
    @Column(columnDefinition =  "MEDIUMBLOB")
    private String image;
}
