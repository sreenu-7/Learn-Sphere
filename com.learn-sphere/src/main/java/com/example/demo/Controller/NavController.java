package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class NavController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/register")
	public String registration() {
		return "register";
	}
	@GetMapping("/addCourse")
	public String addCourse() {
		return "addCourse";
	}
	@GetMapping("/addLesson")
	public String addLesson() {
		return "addLesson";
	}
	@GetMapping("/myCourses")
	public String myCourses() {
		return "myCourses";
	}

	
}
