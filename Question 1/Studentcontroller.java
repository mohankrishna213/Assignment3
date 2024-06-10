package com.example.controller;

import com.example.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Value("${student.name}")
    private String studentName;

    @Value("${student.id}")
    private int studentId;

    @GetMapping("/student")
    public Student getStudent() {
        return new Student(studentName, studentId);
    }
}
