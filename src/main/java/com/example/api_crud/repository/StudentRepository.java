package com.example.api_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_crud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	

}
