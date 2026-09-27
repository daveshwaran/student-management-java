package com.example.Employee_Management.controllers;

import com.example.Employee_Management.models.EnrollmentEntity;
import com.example.Employee_Management.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrollment")
public class EnrollmentController {
    @Autowired
    EnrollmentService enrollmentService;
    @PostMapping
    public EnrollmentEntity enrollStudent(
            @RequestParam Long studentId,
            @RequestParam Long courseId) {
        return enrollmentService.enrollStudent(studentId, courseId);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        enrollmentService.removeEnrollment(id);
    }
    @GetMapping("/student/{id}")
    public List<EnrollmentEntity> getStudentEnrollments(
            @PathVariable Long id) {

        return enrollmentService.getStudentEnrollments(id);
    }

    @GetMapping("/course/{id}")
    public List<EnrollmentEntity> getCourseEnrollments(
            @PathVariable Long id) {

        return enrollmentService.getCourseEnrollments(id);
    }

}
