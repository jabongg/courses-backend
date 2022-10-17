package com.example.courses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository repo;

	public List<Course> getCourses() {
		return repo.findAll();
	}

	public List<Course> listAll() {
		return repo.findAll();
	}

	public void save(Course Course) {
		repo.save(Course);
	}

	public Course get(long id) {
		return repo.findById(id).get();
	}

	public void delete(long id) {
		repo.deleteById(id);
	}

	public String addCourse(Course course) {
		repo.save(course);
		return "course saved to db"; // just an ack msg
	}
}
