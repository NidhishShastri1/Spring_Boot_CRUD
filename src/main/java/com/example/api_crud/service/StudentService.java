package com.example.api_crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_crud.dao.StudentDao;
import com.example.api_crud.model.Student;
import com.example.api_crud.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;
	@Autowired
	StudentRepository studentRepository;

	public String addStudent(Student student) {
		return studentDao.addStudent(student);
	}

	public List<Student> fetchAllStudent() {
		return studentDao.fetchAllStudent();
	}

	public Object fetchStudent(int id) {

		Optional<Student> os = studentDao.fetchStudent(id);
		if (os.isPresent()) {
			return os;
		}
		return "No data found with id" + id;
	}

	public String removeStudent(int id) {
		Optional<Student> os = studentDao.fetchStudent(id);
		if (os.isPresent()) {
			studentRepository.deleteById(id);
			return "deletd";
		}
		return "No data found with id" + id;
	}
	public String removeStudents() {
		List<Student> list = studentDao.fetchAllStudent();
		if(list.isEmpty()) {
			return "no records found";
		}else {
			studentRepository.deleteAll();
			return "Everything deleted";
		}
	}
public String updateStudent(Student student) {
	Optional<Student> os = studentDao.fetchStudent(student.getId());
	if (os.isPresent()) {
		studentRepository.save(student);
		return "updated";
	}
	return "No data found with id" + student.getId();
	}
}
