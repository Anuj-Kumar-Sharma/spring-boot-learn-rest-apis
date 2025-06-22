package com.codingshuttle.youtube.LearningRESTAPIs.repository;

import com.codingshuttle.youtube.LearningRESTAPIs.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
