package com.example.dailycode_buffer.repository;

import com.example.dailycode_buffer.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
