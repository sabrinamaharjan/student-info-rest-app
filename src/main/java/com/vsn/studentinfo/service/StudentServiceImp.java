package com.vsn.studentinfo.service;

import com.vsn.studentinfo.model.Student;
import com.vsn.studentinfo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        final Iterable<Student> students = studentRepository.findAll();
        return (List<Student>) students;
    }
}
