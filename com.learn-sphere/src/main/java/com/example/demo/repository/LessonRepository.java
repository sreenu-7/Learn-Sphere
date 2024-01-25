package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Lessons;

public interface LessonRepository extends JpaRepository<Lessons, Integer>{

	Lessons findBylessonName(String lessonName);

}
