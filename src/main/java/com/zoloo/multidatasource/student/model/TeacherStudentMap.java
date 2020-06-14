package com.zoloo.multidatasource.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.PositiveOrZero;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "teacher_student_map")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeacherStudentMap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "student_id")
    private int studentId;

    @Column(name = "teacher_id")
    private int teacherId;

    @PositiveOrZero
    @Column(name = "year")
    private int year;

    @PositiveOrZero
    @Column(name = "semister")
    private int semister;

}