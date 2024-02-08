package com.sms.Student_Management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.Student_Management_system.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{
	
}
