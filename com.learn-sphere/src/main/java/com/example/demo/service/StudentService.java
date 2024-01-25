package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Course;

public interface StudentService {

	public List<Course> fetchAllCourses();

	public List<Course> fetchMyCourses();

	public List<Course> fetchAllLessons();


}
