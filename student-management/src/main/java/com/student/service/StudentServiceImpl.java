package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.dao.StudentRepo;
import com.student.model.Student;

public class StudentServiceImpl implements StudentService{
//	@Autowired
//	private StudentRepo studentRepo;
	private final StudentRepo studentRepo;
	public StudentServiceImpl(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}

	@Override
	public Student getStudentById(int id) {
		Optional<Student> student= studentRepo.findById(id);
		
		System.out.println(student.getName());
		
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student deleteStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
