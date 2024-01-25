package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.entity.Users;
import com.example.demo.repository.StudentRepository;
import com.example.demo.repository.TrainerRepository;
@Service
public class StudentServiceIMPL implements StudentService {

	@Autowired
	StudentRepository repo;

	@Autowired
	TrainerRepository repos;
	
	@Override
	public List<Course> fetchAllCourses() {
		return repo.findAll();
	}

	@Override
	public List<Course> fetchMyCourses() {
		return repo.findAll();
	}

	@Override
	public List<Course> fetchAllLessons() {
		return repo.findAll();
	}
	
	

	
}
