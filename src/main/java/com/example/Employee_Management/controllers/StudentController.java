package com.example.Employee_Management.controllers;

import com.example.Employee_Management.models.StudentEntity;
import com.example.Employee_Management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PutMapping
    public StudentEntity addStudent(@RequestBody StudentEntity student){
        return studentService.addStudent(student);
    }
    @GetMapping
    public List<StudentEntity> getAllStudent(){
        return studentService.getAllStudents();
    }
    @GetMapping("/{id}")
    public StudentEntity getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
}
