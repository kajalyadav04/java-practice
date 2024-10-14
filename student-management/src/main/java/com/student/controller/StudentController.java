package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentservice;

	@GetMapping(value = "/student/id/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") int id) {

		return new ResponseEntity<Student>(studentservice.getStudentById(id), HttpStatus.ACCEPTED);

	}

	@GetMapping(value = "/student")
	public ResponseEntity<List<Student>> getAllStudent() {

		return new ResponseEntity<List<Student>>(studentservice.getAllStudent(), HttpStatus.ACCEPTED);

	}

	@PostMapping(value = "/student")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		return new ResponseEntity<Student>(studentservice.createStudent(student), HttpStatus.CREATED);

	}

	@DeleteMapping(value = "/student/id/{id}")
	public void deleteStudent(@PathVariable("id") int id) {
		studentservice.deleteStudent(id);

	}

}
