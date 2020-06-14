package com.zoloo.multidatasource.teacher.TeacherRepository;

import com.zoloo.multidatasource.teacher.model.Teacher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    
}