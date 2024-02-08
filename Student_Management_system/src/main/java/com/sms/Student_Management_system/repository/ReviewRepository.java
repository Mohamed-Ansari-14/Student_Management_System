package com.sms.Student_Management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.Student_Management_system.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer>
{
	
}
