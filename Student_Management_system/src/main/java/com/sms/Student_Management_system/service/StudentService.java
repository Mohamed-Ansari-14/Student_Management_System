package com.sms.Student_Management_system.service;

import java.util.List;

import com.sms.Student_Management_system.entity.Student;

public interface StudentService 
{
	List<Student> findAll();
	
	Student findById(int id);
	
	Student save(Student student);

	Student getStudentById(Integer id);

	Student updateStudent(Student student);

	void deleteStudentById(Integer id);
}
