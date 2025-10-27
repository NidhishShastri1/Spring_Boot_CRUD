package com.example.api_crud.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.example.api_crud.model.Student;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@PostMapping
	public Student addStudent(@RequestBody Student student) {
		return student;
	}
	
	@DeleteMapping
	public void removeStudent() {
		
	}
	
	@GetMapping("/id")
	public void fetchStudent() {
		
	}
	
	@GetMapping
	public void fetchAllStudent() {
		
	}
	
	@PutMapping
	public void updateStudent() {
	
	}

}
