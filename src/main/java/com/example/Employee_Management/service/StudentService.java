package com.example.Employee_Management.service;

import com.example.Employee_Management.models.StudentEntity;
import com.example.Employee_Management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public StudentEntity addStudent(StudentEntity student){
        return studentRepository.save(student);
    }
    public List<StudentEntity> getAllStudents(){
        return studentRepository.findAll();
    }
    public StudentEntity getStudentById(Long id){
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student Not Found"));
    }
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
        System.out.println("deleted successfully");
    }
}
