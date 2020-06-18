package com.vsn.studentinfo.repository;

import com.vsn.studentinfo.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student , Long> {
}
