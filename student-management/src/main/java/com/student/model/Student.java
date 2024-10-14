package com.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private int id;
	private String name;
	private String address;
	private String bloodGroup;
	private int age;

	public Student() {
		
	}
	public Student(int id, String name, String address, String bloodGroup, int age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.bloodGroup = bloodGroup;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", bloodGroup=" + bloodGroup + ", age="
				+ age + "]";
	}
	
	
	
	

}
