package com.vsn.studentinfo.controller;

import com.vsn.studentinfo.model.Student;
import com.vsn.studentinfo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> findAll(){
        final List<Student> students = studentService.findAll();
        return students;
    }

    @GetMapping("/{id}")
    Student findById(@PathVariable  Long id){
        final Student student = studentService.findById(id);
        return student;
    }

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable  Long id) {
        studentService.deleteById(id);
    }
    @PostMapping
    Student save(@RequestBody  Student student){
        final Student student1 = studentService.save(student);
        return student1;
    }
}
