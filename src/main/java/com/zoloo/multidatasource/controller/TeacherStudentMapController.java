package com.zoloo.multidatasource.controller;

import java.util.List;

import com.zoloo.multidatasource.student.model.TeacherStudentMap;
import com.zoloo.multidatasource.student.repository.TeacherStudentMapRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("teacher/student/map")
public class TeacherStudentMapController {
    
    private final TeacherStudentMapRepository teacherStudentMapRepository;

    public TeacherStudentMapController(TeacherStudentMapRepository mRepo){
        this.teacherStudentMapRepository = mRepo;
    }

    @GetMapping(value="/all")
    public List<TeacherStudentMap> getAllTeacherStudentMap() {
        return teacherStudentMapRepository.findAll();
    }
    
}