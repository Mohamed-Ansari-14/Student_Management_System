package com.sms.Student_Management_system.service;

import com.sms.Student_Management_system.entity.Review;

public interface ReviewService 
{
	Review findById(int id);
	
	Review save(Review review);
	
	void remove(Review review);
}
