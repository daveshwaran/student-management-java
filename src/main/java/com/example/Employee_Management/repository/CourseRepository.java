package com.example.Employee_Management.repository;

import com.example.Employee_Management.models.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseEntity,Long> {
}
