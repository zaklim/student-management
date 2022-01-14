package org.local.studentmanagement.service;

import org.local.studentmanagement.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();

    Student get(long id);

    void save(Student student);

    void delete(long id);
}
