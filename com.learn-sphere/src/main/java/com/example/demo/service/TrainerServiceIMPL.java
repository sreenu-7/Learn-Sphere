package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Course;
import com.example.demo.entity.Lessons;
import com.example.demo.repository.LessonRepository;
import com.example.demo.repository.TrainerRepository;
@Service
public class TrainerServiceIMPL implements TrainerService  {

	@Autowired
	TrainerRepository repo;
	
	@Autowired
	LessonRepository repos;
	
	@Override
	public void addCourse(Course course) {
		repo.save(course);
	}

	@Override
	public boolean courseExits(String courseName) {
		Course course=repo.findBycourseName(courseName);
		if(course==null) {
			return false;	
		}else {
			return true;
		}
	}

	@Override
	public boolean lessonExits(String lessonName) {
		Lessons lesson=repos.findBylessonName(lessonName);
		if(lesson==null) {
			return false;	
		}else {
			return true;
		}
	}

	@Override
	public void addLesson(Lessons lessons) {
		repos.save(lessons);
	}

	@Override
	public List<Course> fetchAllCourses() {
		return repo.findAll();
	}

}
