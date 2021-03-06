package com.student.librarymanagement.repository;

import com.student.librarymanagement.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findByEmail(@Param("email") String email);
}
