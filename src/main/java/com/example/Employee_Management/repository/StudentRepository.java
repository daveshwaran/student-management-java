package com.example.Employee_Management.repository;

import com.example.Employee_Management.models.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity,Long> {
}
