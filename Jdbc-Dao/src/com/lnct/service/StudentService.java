package com.lnct.service;

import com.lnct.dao.StudentDao;
import com.lnct.entity.StudentBean;

public class StudentService {
	StudentDao studentDao= new  StudentDao();
	public void insertData(StudentBean studentBean) {
		
//		StudentBean studentBean = new StudentBean(4, "kajal", "jharkhand", 8, 700);
		studentDao.addStudent(studentBean);
	}
	public void updateStudentData(int roll, String name) {
		// TODO Auto-generated method stub
		studentDao.updateStudentInfo(roll,name);
		
	}
	public void deleteStudentRecord(int roll) {
		// TODO Auto-generated method stub
		studentDao.deleteStudentInfo(roll);
		
	}
	public void fetchAllStudentsRecord() {
		// TODO Auto-generated method stub
		studentDao.fetchAllStudentsInfo();
		
	}
	
	

}
