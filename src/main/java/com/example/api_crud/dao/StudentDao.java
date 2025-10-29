package com.example.api_crud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.api_crud.model.Student;
import com.example.api_crud.repository.StudentRepository;

@Repository
public class StudentDao {
	
	@Autowired
	StudentRepository studentRepository;
	public String addStudent(Student student) {
		studentRepository.save(student);
		return "data inserted";		
	}
	 public List<Student> fetchAllStudent() {
	   return     studentRepository.findAll();
	   
	}
	

}
