package com.example;

import com.example.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        if (args.length < 2) {
            System.out.println("Please provide student name and id as command-line arguments.");
            return;
        }

        String name = args[0];
        int id = Integer.parseInt(args[1]);

        Student student = new Student(name, id);
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
    }
}
