package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.student.dao.StudentRepo;
import com.student.exception.CustomException;
import com.student.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
//	@Autowired
//	private StudentRepo studentRepo;
	private final StudentRepo studentRepo;

	public StudentServiceImpl(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}

	@Override
	public Student getStudentById(int id) {
		Optional<Student> optional = studentRepo.findById(id);
		if (optional.isEmpty()) {
			throw new CustomException("student not found");

		}
		return optional.get();

	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> student=studentRepo.findAll();
		if(student.isEmpty()) {
			throw new CustomException("student not found");
		}
		
		return student;
	}

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
		
	}

}
