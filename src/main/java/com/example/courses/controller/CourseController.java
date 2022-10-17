package com.example.courses.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	CourseService courseService;
	
	@GetMapping("/course")
	public List<Course> getCourses() {
		List<Course> courses = new ArrayList<>();
		
		Course course1 = new Course();
		course1.setId(1);
		course1.setTitle("Data Structures And Algorithms");
		course1.setDescription("DSAL has potential to boost your carrer to sky");
		courses.add(course1);
		
		Course course2 = new Course();
		course2.setId(2);
		course2.setTitle("OOAD");
		course2.setDescription("OOAD has potential to boost your carrer to great Programmer");
		courses.add(course2);
		
		return courses;
	}
	
		
	@PostMapping("/course")
	public String addCourse(@RequestBody Course course) {		
		return courseService.addCourse(course);
	}
	
	@GetMapping("/")
	public List<Course> getAllCourse() {
		return courseService.listAll();
	}
	
	@GetMapping("/{courseId}")
	public Course getCourse(@PathVariable Long courseId) {
		return courseService.get(courseId);		
	}
	
	@DeleteMapping("/{courseId}")
	public String deleteCourse(@PathVariable Long courseId) {
		courseService.delete(courseId);		
		return "course deleted";		
	}
}
