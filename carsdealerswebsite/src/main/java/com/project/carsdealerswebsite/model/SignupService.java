package com.project.carsdealerswebsite.model;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SignupService {

    private final ServiceRepository serviceRepository;

    @Autowired
    public SignupService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public SignupDetails saveSignupDetails(SignupDetails signupDetails) {
        // Check if a user with the same username already exists
        SignupDetails existingUser = serviceRepository.findByUsername(signupDetails.getUsername());
        if (existingUser != null) {
            // User with the same username already exists, handle the situation accordingly
            // For example, you can throw an exception or return null to indicate failure
            throw new IllegalArgumentException("Username already exists");
        }
        
        // No user with the same username exists, proceed with saving
        return serviceRepository.save(signupDetails);
    }

    // Get all SignupDetails entities
    public List<SignupDetails> getAllSignupDetails() {
        return serviceRepository.findAll();
    }

    // Get a SignupDetails entity by its ID
    public Optional<SignupDetails> getSignupDetailsById(Integer id) {
        return serviceRepository.findById(id);
    }

    // Update a SignupDetails entity
    public SignupDetails updateSignupDetails(SignupDetails signupDetails) {
        return serviceRepository.save(signupDetails);
    }

    // Delete a SignupDetails entity by its ID
    public void deleteSignupDetails(Integer id) {
        serviceRepository.deleteById(id);
    }
    
    
    // Authenticate user based on username and password
    public boolean authenticate(String username, String password) {
        // Retrieve user details by username
        SignupDetails userDetails = serviceRepository.findByUsername(username);

        // Check if user exists and password matches
        return userDetails != null && userDetails.getPassword().equals(password);
    }

    
}
