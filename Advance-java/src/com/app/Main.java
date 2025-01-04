package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.app.dto.Student;

public class Main {

	public static void main(String[] args) {
		
		Predicate<String> pd = s-> s.length()>7;
		
		Predicate<String> predicate  = new Predicate<String>() {			
			@Override
			public boolean test(String t) {
				
				return t.length() > 0;
			}
		};

//		System.out.println(pd.test("lambdaexp"));
//		System.out.println(predicate.test("anjalianja"));
		
		
		List<Student> students=new ArrayList<>();
		
		students.add(new Student(10, "name1", 650));
		students.add(new Student(12, "name2", 750));
		students.add(new Student(13, "name3", 550));
		students.add(new Student(14, "name4", 820));
		students.add(new Student(15, "name5", 720));
		students.add(new Student(16, "name6", 620));
				students.forEach(t->System.out.println(t.getName()));
//		System.out.println("Original list " + students);
//		students.removeIf(s -> s.getMarks()>600);
//		
//		
//
//		System.out.println("Filered list " + students);
	}

	}
