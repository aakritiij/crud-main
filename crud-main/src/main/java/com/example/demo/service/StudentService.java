package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import com.example.demo.repository.StudentRepository;
import com.example.demo.model.Student;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repo;

    public List<Student> getAll() {
        return repo.findAll();
    }

    public Student create(Student student) {
        return repo.save(student);
    }

    public Student update(Long id, Student student) {
        Student s = repo.findById(id).orElseThrow();
        s.setName(student.getName());
        s.setEmail(student.getEmail());
        return repo.save(s);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}