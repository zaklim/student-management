package org.local.studentmanagement.repository;

import org.local.studentmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
}
