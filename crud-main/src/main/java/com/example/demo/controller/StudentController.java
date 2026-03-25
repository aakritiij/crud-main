package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import jakarta.validation.Valid;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
@CrossOrigin
public class StudentController {

    private final StudentService service;

    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Student create(@Valid @RequestBody Student s) {
        return service.create(s);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student s) {
        return service.update(id, s);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}