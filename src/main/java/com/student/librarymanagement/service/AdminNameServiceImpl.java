package com.student.librarymanagement.service;

import com.student.librarymanagement.entity.AdminName;
import com.student.librarymanagement.repository.AdminNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminNameServiceImpl implements AdminNameService {

    private AdminNameRepository adminNameRepository;

    @Autowired
    public AdminNameServiceImpl(AdminNameRepository adminNameRepository) {
        this.adminNameRepository = adminNameRepository;
    }

    @Override
    public AdminName getAdminName(String email) {
        return adminNameRepository.findByEmail(email);
    }

    @Override
    public void saveAdminName(AdminName adminName) {
        adminNameRepository.save(adminName);
    }

}
