package com.vsn.studentinfo.service;

import com.vsn.studentinfo.model.Student;

import java.util.List;

public interface StudentService  {
     List<Student> findAll();

     Student findById(Long id);
     void deleteById(Long id);

     Student save(Student student);

}
