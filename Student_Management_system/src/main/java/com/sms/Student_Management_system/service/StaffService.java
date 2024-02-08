package com.sms.Student_Management_system.service;

import java.util.List;

import com.sms.Student_Management_system.entity.Staff;

public interface StaffService 
{
	List<Staff> getAllStaff();

	Staff saveStaff(Staff staff);

	Staff getStaffById(Integer id);

	Staff updateStaff(Staff staff);

	void deleteStaffById(Integer id);
}
