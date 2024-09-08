package com.example.StudentsList.service.Impl;

import com.example.StudentsList.model.Student;
import com.example.StudentsList.repository.InMemoryStudentDAO;
import com.example.StudentsList.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentService implements StudentService {

    private final InMemoryStudentDAO repository;

    public List<Student> findAllStudent() {
        return repository.findAllStudent();
    }

    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }


    public Student findStudentByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
