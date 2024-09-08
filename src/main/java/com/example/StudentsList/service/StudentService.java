package com.example.StudentsList.service;

import com.example.StudentsList.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAllStudent();

    Student saveStudent(Student student);

    Student findStudentByEmail(String email);

    Student updateStudent(Student student);

    void deleteStudent(String email);
}
