package com.zoloo.multidatasource.student.repository;

import com.zoloo.multidatasource.student.model.TeacherStudentMap;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherStudentMapRepository extends JpaRepository<TeacherStudentMap, Integer> {
    
}