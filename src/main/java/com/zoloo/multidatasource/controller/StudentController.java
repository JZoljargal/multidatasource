package com.zoloo.multidatasource.controller;

import java.util.List;

import com.zoloo.multidatasource.student.model.Student;
import com.zoloo.multidatasource.student.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("student")
public class StudentController {
    
    
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository sRepo){
        this.studentRepository = sRepo;
    }

    @GetMapping(value="/all")
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
    
    @PostMapping(value="/save")
    public Student saveNewStudent(@RequestBody Student entity) {
        //TODO: process POST request
        return studentRepository.save(entity);
    }
    


}