package com.lnct.entity;

public class StudentBean {
	int roll;
	String name;
	String address;
	int mobile;
	int marks;
	
	

	

	public StudentBean(int roll, String name, String address, int mobile, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.marks = marks;
	}



	public int getRoll() {
		return roll;
	}



	public void setRoll(int roll) {
		this.roll = roll;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getMobile() {
		return mobile;
	}



	public void setMobile(int mobile) {
		this.mobile = mobile;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "StudentBean [roll=" + roll + ", name=" + name + ", address=" + address + ", mobile=" + mobile
				+ ", marks=" + marks + "]";
	}	
	
}
