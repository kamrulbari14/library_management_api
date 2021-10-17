package com.student.librarymanagement.service;

import com.student.librarymanagement.entity.Department;

import java.util.List;

public interface DepartmentService {


    public List<Department> getDepartment();

    public void saveDepartment(Department department);
}
