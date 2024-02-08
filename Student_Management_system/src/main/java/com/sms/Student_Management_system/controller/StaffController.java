package com.sms.Student_Management_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sms.Student_Management_system.entity.Staff;
import com.sms.Student_Management_system.service.StaffService;

@Controller
public class StaffController 
{
	private StaffService staffService;

	public StaffController(StaffService staffService) {
		super();
		this.staffService = staffService;
	}
	
	@GetMapping("/staffs")
	public String listStaff(Model model)
	{
		model.addAttribute("staffs", staffService.getAllStaff());
		return "staffs";
	}
	
	@GetMapping("/staffs/new")
	public String createStaffForm(Model model)
	{
		//Create Student object to hold student form
		Staff staff = new Staff();
		model.addAttribute("staff", staff);
		return "create_staff";
	}
	
	@PostMapping("/staffs")
	public String saveStaff(@ModelAttribute("staff") Staff staff)
	{
		staffService.saveStaff(staff);
		return "redirect:/staffs";
	}
	
	@GetMapping("/staffs/edit/{id}")
	public String editStaffForm(@PathVariable Integer id,Model model)
	{
		model.addAttribute("staff", staffService.getStaffById(id));
		return "edit_staff";
	}
	
	@PostMapping("/staffs/{id}")
	public String updateStudent(@PathVariable Integer id, 
			@ModelAttribute("staff")Staff staff, Model model)
	{
		Staff existingStaff = staffService.getStaffById(id);
		existingStaff.setId(staff.getId());
		existingStaff.setStaffName(staff.getStaffName());
		existingStaff.setStaffHandlingSubjects(staff.getStaffHandlingSubjects());
		
		staffService.updateStaff(existingStaff);
		return "redirect:/staffs";
	}
	
	@GetMapping("/staffs/{id}")
	public String deleteStaff(@PathVariable Integer id)
	{
		staffService.deleteStaffById(id);
		return "redirect:/staffs";
	}
}
