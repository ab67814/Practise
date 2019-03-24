package com.java.practice.oops;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableAndComparator {

	public static void main(String[] args) {
		
		//Creating a list of students  
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student("first",12,'a'));
		al.add(new Student("Secnd",14,'d'));
		al.add(new Student("thrd",16,'g'));
		
		Collections.sort(al, Student.standComparator);
		System.out.println("done");
	}

}
