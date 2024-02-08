package com.sms.Student_Management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.Student_Management_system.entity.Staff;

public interface StaffRepository extends JpaRepository<Staff, Integer>
{
	
}
