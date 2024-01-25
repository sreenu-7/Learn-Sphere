package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Course;
import com.example.demo.entity.Lessons;

public interface TrainerService  {

	public void addCourse(Course course);

	public boolean courseExits(String courseName);

	public void addLesson(Lessons lessons);

	public boolean lessonExits(String lessonName);

	public List<Course> fetchAllCourses();


}
