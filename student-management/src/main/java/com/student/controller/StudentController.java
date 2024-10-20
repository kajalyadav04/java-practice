package com.student.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.exception.ExceptionDTO;
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
	@GetMapping(value = "/student/id")
	public ResponseEntity<Student> getById(@RequestParam("id") int id) {

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

	@GetMapping(value = "/student/v2/id/{id}")
	public Student getStudentByIdV2(@PathVariable int id) {
		if(id>100) {
			throw new IllegalArgumentException("invalid id");
		}
		return new Student();
	}
	
	@GetMapping(value = "/student/name")
	public String name(
			@RequestParam(value = "name", defaultValue = "anjali") String name, 
			@RequestParam(value = "id", required = false) Integer id		
			) {		
		return ""+name +", id: "+id;
	}

//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<ExceptionDTO> illegalArgument(Exception ex) {
//		System.out.println("inside myHandler method...");
//		ExceptionDTO dto = new ExceptionDTO(LocalDateTime.now(), ex.getMessage());
//		return new ResponseEntity<ExceptionDTO>(dto, HttpStatus.BAD_REQUEST);
//	}

}
