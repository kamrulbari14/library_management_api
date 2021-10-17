package com.student.librarymanagement.service;

import com.student.librarymanagement.entity.Admin;

public interface AdminService {

    boolean getAdmin(String email);

    void saveAdmin(Admin admin);
}
