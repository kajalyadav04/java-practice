package com.lnct;

import com.lnct.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("k");
		EntityManager em = emf.createEntityManager();
		Student s = em.find(Student.class, 1);
		if (s != null) {
			System.out.println(s);
		} else {
			System.out.println("student not found");
		}
		em.close();
	}
}
