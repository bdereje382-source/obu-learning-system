package com.obu.obu.lerning.system.repository;

import com.obu.obu.lerning.system.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
