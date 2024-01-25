package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Course;

public interface TrainerRepository extends JpaRepository<Course, Integer> {

	public Course findBycourseName(String courseName);

}
