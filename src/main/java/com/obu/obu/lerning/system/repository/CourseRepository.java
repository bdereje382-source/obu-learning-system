package com.obu.obu.lerning.system.repository;

import com.obu.obu.lerning.system.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
