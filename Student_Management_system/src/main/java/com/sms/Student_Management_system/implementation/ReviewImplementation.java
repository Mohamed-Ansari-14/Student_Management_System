package com.sms.Student_Management_system.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.Student_Management_system.entity.Review;
import com.sms.Student_Management_system.repository.ReviewRepository;
import com.sms.Student_Management_system.service.ReviewService;

@Service
public class ReviewImplementation implements ReviewService
{
	@Autowired
	private ReviewRepository reviewRepository;
	
	@Override
	public Review findById(int id) {
		return reviewRepository.findById(id).get();
	}

	@Override
	public Review save(Review review) {
		return reviewRepository.save(review);
	}

	@Override
	public void remove(Review review) {
		reviewRepository.delete(review);
	}
	
}
