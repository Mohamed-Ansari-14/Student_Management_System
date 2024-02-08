package com.sms.Student_Management_system.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.Student_Management_system.entity.Course;
import com.sms.Student_Management_system.repository.CourseRepository;
import com.sms.Student_Management_system.service.CourseService;

@Service
public class CourseImplementation implements CourseService
{
	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public List<Course> findAll() {
		return courseRepository.findAll();
	}

	@Override
	public Course findById(int id) {
		return courseRepository.findById(id).get();
	}

	@Override
	public Course save(Course course) {
		return courseRepository.save(course);
	}
	
}
