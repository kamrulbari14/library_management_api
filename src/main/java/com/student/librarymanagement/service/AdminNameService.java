package com.student.librarymanagement.service;

import com.student.librarymanagement.entity.AdminName;

public interface AdminNameService {

    public AdminName getAdminName(String email);

    public void saveAdminName(AdminName adminName);
}
