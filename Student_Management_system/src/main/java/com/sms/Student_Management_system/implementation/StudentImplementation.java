package com.sms.Student_Management_system.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.Student_Management_system.entity.Student;
import com.sms.Student_Management_system.repository.StudentRepository;
import com.sms.Student_Management_system.service.StudentService;

@Service
public class StudentImplementation implements StudentService
{
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student findById(int id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Integer id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Integer id) {
		studentRepository.deleteById(id);
	}
	
}
