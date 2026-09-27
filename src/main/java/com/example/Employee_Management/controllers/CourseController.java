package com.example.Employee_Management.controllers;

import com.example.Employee_Management.models.CourseEntity;
import com.example.Employee_Management.models.StudentEntity;
import com.example.Employee_Management.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService courseService;
    @PutMapping
    public CourseEntity addCourse(@RequestBody CourseEntity course){
        return courseService.addCourse(course);
    }
    @GetMapping
    public List<CourseEntity> getAllCourse(){
        return courseService.getAllCourses();
    }
    @GetMapping("/{id}")
    public CourseEntity getCourseById(@PathVariable Long id){
        return courseService.getCourseById(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        courseService.deleteCourse(id);
    }
}
