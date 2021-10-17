package com.student.librarymanagement.service;

import com.student.librarymanagement.entity.Admin;

public interface AdminService {

    public boolean getAdmin(String email);

    public void saveAdmin(Admin admin);
}
