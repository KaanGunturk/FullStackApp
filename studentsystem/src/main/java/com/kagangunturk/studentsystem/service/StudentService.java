package com.kagangunturk.studentsystem.service;

import com.kagangunturk.studentsystem.model.Student;

import java.util.List;

public interface StudentService  {

    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
}
