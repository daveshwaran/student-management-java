package com.example.Employee_Management.service;

import com.example.Employee_Management.models.CourseEntity;
import com.example.Employee_Management.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public CourseEntity addCourse(CourseEntity course) {
        return courseRepository.save(course);
    }

    public List<CourseEntity> getAllCourses() {
        return courseRepository.findAll();
    }

    public CourseEntity getCourseById(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found"));
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
        System.out.println("course deleted successfully");
    }
}