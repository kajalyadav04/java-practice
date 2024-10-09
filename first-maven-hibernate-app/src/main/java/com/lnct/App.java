package com.lnct;

import java.util.Scanner;

import javax.swing.border.EtchedBorder;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */

public class App {
	static EntityManagerFactory emf;
	static {
		emf = Persistence.createEntityManagerFactory("k");
	}

	public static void main(String[] args) {
		// System.out.println( "Hello World!" );
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("book_connection");
//		EntityManager eManager = emf.createEntityManager();
//		searchStudentRecord(1);
//		saveStudentRecord();
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter roll which you want to delete");
		int roll=scanner.nextInt();
		
    	deleteRecord(roll);

	}
//
	private static void deleteRecord(int roll) {
		// TODO Auto-generated method stub
		EntityTransaction et=null;
		EntityManager em=emf.createEntityManager();
		Student student=em.find(Student.class, roll);
		if(student!=null) {
			
			try {
				et=em.getTransaction();
				et.begin();
				em.remove(student);
				et.commit();
			} catch (Exception e) {
				// TODO: handle exception
				et.rollback();
				e.printStackTrace();
			}
			
			finally {
				em.close();
			}
			
		}
		else {
			System.out.println("student record notfound");
		}
		
		
		
	}

	private static void saveStudentRecord() {
		// TODO Auto-generated method stub
		EntityTransaction et=null;
		EntityManager em=null;
		try {

			em = emf.createEntityManager();
			Student student = new Student(7, "a", "jh", "45", 890);
			et = em.getTransaction();
			et.begin();
			em.persist(student);
			et.commit();

		} catch (Exception e) {
			// TODO: handle exception
			et.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}

	}

	public static void searchStudentRecord(int roll) {
		EntityManager eManager = emf.createEntityManager();

		Student student = eManager.find(Student.class, roll);

		if (student != null) {
			System.out.println(student);
		} else {
			System.out.println("student not found");
		}
		eManager.close();

	}
	
}
