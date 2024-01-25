package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.entity.Course;
import com.example.demo.entity.Lessons;
import com.example.demo.service.TrainerService;

@Controller
public class TrainerController {

	@Autowired
	TrainerService service;
	
	@PostMapping("/addCourse")
	public String addCourse(@ModelAttribute Course course) {
		boolean courseStatus=service.courseExits(course.getCourseName());
		if(courseStatus==false) {
			service.addCourse(course);
			System.out.println("course added successfully");
		}else{
			System.out.println("course already existed");
		}
			return "addCourse";
		
	}
	@PostMapping("/addLesson")
	public String addLesson(@ModelAttribute Lessons lessons) {
		boolean lessonStatus=service.lessonExits(lessons.getLessonName());
		if(lessonStatus==false) {
			service.addLesson(lessons);
			System.out.println("Lesson added successfully");
		}else{
			System.out.println("Lesson already existed");
		}
			return "addLesson";
		
	}
	@GetMapping("/viewAllCourses")
	public String viewAllCourses(Model model) {
		List<Course> courseList=service.fetchAllCourses();
		model.addAttribute("courses", courseList);
		return "viewAllCourses";
		
	}
	
}
