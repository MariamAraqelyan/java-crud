package com.example.StudentsList.service.Impl;

import com.example.StudentsList.model.Student;
import com.example.StudentsList.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryStudentService implements StudentService {

    public List<Student> findAllStudent() {
        return List.of(
                Student.builder().firstName("Mariam").email("mariam@gmail.com").age(33).build(),
                Student.builder().firstName("John").email("johm@gmail.com").age(13).build(),
                Student.builder().firstName("Ann").email("ann@gmail.com").age(23).build()
        );
    }
}
