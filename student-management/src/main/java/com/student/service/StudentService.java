package com.student.service;

import java.util.List;

import com.student.model.Student;

public interface StudentService {
	public Student getStudentById(int id);
	public List<Student> getAllStudent();
	public Student createStudent(Student student);
	public void deleteStudent(int id);
	
	

}
