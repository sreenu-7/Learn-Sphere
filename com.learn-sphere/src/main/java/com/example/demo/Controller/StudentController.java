package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Course;
import com.example.demo.entity.Users;
import com.example.demo.service.StudentService;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentController {

	@Autowired
	StudentService service;

	@GetMapping("/buyCourses")
	public String buyCourses(Model model) {
		List<Course> courseList=service.fetchAllCourses();
		model.addAttribute("courses", courseList);
		return "buyCourses";
		
	}
	@PostMapping("/myCourses")
	public String myCourses(Model model) {
		List<Course> courseList=service.fetchMyCourses();
		model.addAttribute("courses", courseList);
		return "myLesson";
		
	}

	@PostMapping("/myLessons")
	public void myLessons(Model model) {
		List<Course> lessonList=service.fetchAllLessons();
		model.addAttribute("lessons", lessonList);	
	}
}
