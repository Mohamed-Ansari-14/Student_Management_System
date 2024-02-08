package com.sms.Student_Management_system.service;

import java.util.List;

import com.sms.Student_Management_system.entity.Course;

public interface CourseService 
{
	List<Course> findAll(); 
	
	Course findById(int id); 
	
	Course save(Course course);
}
