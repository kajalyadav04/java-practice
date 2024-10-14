package com.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer >{

}
