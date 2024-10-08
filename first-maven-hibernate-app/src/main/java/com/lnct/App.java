package com.lnct;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//        System.out.println( "Hello World!" );
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("book_connection");
		EntityManager eManager = emf.createEntityManager();
		Student student= eManager.find(Student.class, 2);
		if(student!=null) {
			System.out.println(student);
		}
		else {
			System.out.println("student not found");
		}
		eManager.close();
	}
}
