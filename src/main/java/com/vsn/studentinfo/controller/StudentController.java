package com.vsn.studentinfo.controller;

import com.vsn.studentinfo.model.Student;
import com.vsn.studentinfo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
