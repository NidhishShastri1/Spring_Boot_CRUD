package com.example.api_crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.example.api_crud.model.Student;
import com.example.api_crud.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	StudentService studentService;
	@PostMapping
	public String addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@DeleteMapping
	public void removeStudent() {
		
	}
	
	@GetMapping("/id")
	public void fetchStudent( ) {
		
	}
	
	@GetMapping
	public List<Student> fetchAllStudent() {
		return studentService.fetchAllStudent();
	}
	
	@PutMapping
	public void updateStudent() {
	
	}

}
