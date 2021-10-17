package com.student.librarymanagement.service;

import com.student.librarymanagement.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getStudents();

    public void saveStudent(Student theStudent);

    public List<Student>  getStudentsbyRoll(Integer theRoll);

    public List<Student>  getStudentsbyDept(String theDept);

    public Student getStudent(Integer theId);

    public void deleteStudent(Integer theId);
}
