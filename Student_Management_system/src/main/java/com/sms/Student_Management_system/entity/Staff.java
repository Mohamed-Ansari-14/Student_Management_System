package com.sms.Student_Management_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Staff 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String staffName;
	private String staffHandlingSubjects;
	
//	public Staff(int id, String staffName, String staffHandlingSubjects) {
//		super();
//		this.id = id;
//		this.staffName = staffName;
//		this.staffHandlingSubjects = staffHandlingSubjects;
//	}
//	
//	public Staff() {
//		super();
//	}
}
