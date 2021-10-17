package com.student.librarymanagement.repository;

import com.student.librarymanagement.entity.AdminName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface AdminNameRepository extends JpaRepository<AdminName, Integer> {
    AdminName findByEmail(@Param("email") String email);
}
