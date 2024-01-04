package com.mirna.hospitalmanagementapi.application.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mirna.hospitalmanagementapi.domain.dtos.DoctorDTO;
import com.mirna.hospitalmanagementapi.domain.dtos.DoctorPublicDataDTO;
import com.mirna.hospitalmanagementapi.domain.entities.Doctor;
import com.mirna.hospitalmanagementapi.domain.services.DoctorService;

import jakarta.validation.Valid;

/**
 * A Spring REST controller for managing doctors.
 *
 * @author Mirna Gama
 * @version 1.0
 */
@RestController
@RequestMapping("/api/v1.0/doctors")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	/**
	 * Post method to create a new Doctor object based on the provided DTO.
	 *
	 * @param doctorDTO The data transfer object containing data for Doctor
	 * entity.
	 * 
	 * @return A response entity containing the saved doctor if successful, or
	 * a 400-level error if there is a validation error
	 */
	@PostMapping
	public ResponseEntity<Object> postDoctor(@RequestBody @Valid DoctorDTO doctorDTO) {
		
		Doctor doctor = doctorService.addDoctor(doctorDTO);
		
		return ResponseEntity.ok(doctor);
		
	}
	
	/**
	 * Get method to receive a list of objects containing data transfer objects with Doctor public information
	 *
	 * @param 
	 * 
	 * @return A response entity containing the list of doctors if successful
	 */
	@GetMapping
	public ResponseEntity<Object> getDoctors() {
		
		List<DoctorPublicDataDTO> doctors = doctorService.findDoctors();
		
		return ResponseEntity.ok(doctors);
	}
}
