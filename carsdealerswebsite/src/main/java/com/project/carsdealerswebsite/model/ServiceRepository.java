package com.project.carsdealerswebsite.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository  extends JpaRepository<SignupDetails, Integer>{
	SignupDetails findByUsername(String username);

}
