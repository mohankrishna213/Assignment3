package com.example;

import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        // Create a new student
        Student student1 = new Student();
        student1.setName("John Doe");
        student1.setEmail("john@example.com");
        studentService.createOrUpdateStudent(student1);

        // Retrieve all students
        System.out.println("All Students:");
        studentService.getAllStudents().forEach(System.out::println);

        // Delete a student by id
        Long idToDelete = 1L;
        studentService.deleteStudent(idToDelete);

        // Retrieve all students after deletion
        System.out.println("All Students after Deletion:");
        studentService.getAllStudents().forEach(System.out::println);
    }
}
