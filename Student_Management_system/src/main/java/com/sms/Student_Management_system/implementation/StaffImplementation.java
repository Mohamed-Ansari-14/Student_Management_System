package com.sms.Student_Management_system.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.Student_Management_system.entity.Staff;
import com.sms.Student_Management_system.repository.StaffRepository;
import com.sms.Student_Management_system.service.StaffService;

@Service
public class StaffImplementation implements StaffService
{
	private StaffRepository staffRepository;

	public StaffImplementation(StaffRepository staffRepository) {
		super();
		this.staffRepository = staffRepository;
	}

	@Override
	public List<Staff> getAllStaff() {
		return staffRepository.findAll();
	}

	@Override
	public Staff saveStaff(Staff staff) {
		return staffRepository.save(staff);
	}

	@Override
	public Staff getStaffById(Integer id) {
		return staffRepository.findById(id).get();
	}

	@Override
	public Staff updateStaff(Staff staff) {
		return staffRepository.save(staff);
	}

	@Override
	public void deleteStaffById(Integer id) {
		staffRepository.deleteById(id);
	}

}
