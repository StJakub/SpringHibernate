package com.example.springhibernate.integration;

import com.example.springhibernate.orm.CustomerService;
import com.example.springhibernate.orm.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class ApiHandler {

    @GetMapping("/hello")
    public String helloworld() {
        return "Helloworld";
    }

    @GetMapping("/getAll")
    public List<Student> getStudents() {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Add", "Stud"));
        list.add(new Student("Add", "Bruh"));
        return list;
    }

    @GetMapping("/getStudent/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        return new Student("Bruh", "Bruuuh");
    }

}
