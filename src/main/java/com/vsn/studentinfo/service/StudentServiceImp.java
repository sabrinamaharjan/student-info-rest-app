package com.vsn.studentinfo.service;

import com.vsn.studentinfo.model.Student;
import com.vsn.studentinfo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        final Iterable<Student> students = studentRepository.findAll();
        return (List<Student>) students;
    }

    @Override
    public Student findById(Long id) {
        final Optional<Student> student = studentRepository.findById(id);

        return student.get();
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student save(Student student) {
        final Student st = studentRepository.save(student);
        return st;
    }
}
