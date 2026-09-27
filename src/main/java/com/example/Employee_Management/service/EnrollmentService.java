package com.example.Employee_Management.service;

import com.example.Employee_Management.models.CourseEntity;
import com.example.Employee_Management.models.EnrollmentEntity;
import com.example.Employee_Management.models.StudentEntity;
import com.example.Employee_Management.repository.CourseRepository;
import com.example.Employee_Management.repository.EnrollmentRepository;
import com.example.Employee_Management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {
    @Autowired
    EnrollmentRepository enrollmentRepository;
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    StudentRepository studentRepository;
    public EnrollmentEntity enrollStudent(Long studentId, Long courseId) {

        StudentEntity student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        CourseEntity course = courseRepository.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        EnrollmentEntity enrollment = new EnrollmentEntity();

        enrollment.setStudent(student);
        enrollment.setCourse(course);

        return enrollmentRepository.save(enrollment);
    }

    public void removeEnrollment(Long enrollmentId) {
        enrollmentRepository.deleteById(enrollmentId);
        System.out.println("Enrollment was deleted successfully");
    }

    public List<EnrollmentEntity> getStudentEnrollments(Long studentId) {
        return enrollmentRepository.findByStudentId(studentId);
    }

    public List<EnrollmentEntity> getCourseEnrollments(Long courseId) {
        return enrollmentRepository.findByCourseId(courseId);
    }
}
