package com.zoloo.multidatasource.controller;

import java.util.List;

import com.zoloo.multidatasource.teacher.TeacherRepository.TeacherRepository;
import com.zoloo.multidatasource.teacher.model.Teacher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("teacher")
public class TeacherController {
    
    private final TeacherRepository teacherRepository;

    public TeacherController(TeacherRepository tRepo){
        this.teacherRepository = tRepo;
    }

    @PostMapping(value="/save")
    public Teacher saveNewTeacher(@RequestBody Teacher entity) {
        //TODO: process POST request
        return teacherRepository.save(entity);
    }

    @GetMapping(value="/all")
    public List<Teacher> getAllTeacher() {
        return teacherRepository.findAll();
    }
    
    
}