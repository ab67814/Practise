package com.java.practice.oops;

import java.util.Comparator;

public class Student extends Instrument<Student> implements Comparable<Student>{
	
	
	private String stand;
	private int age;
	private char sex;
	
	/**
     * Comparator to sort employees list or array in order of stand
     */
    public static Comparator<Student> AgeComparator = new Comparator<Student>() {

        @Override
        public int compare(Student e1, Student e2) {
            return e1.getStand().compareTo(e2.getStand());
        }
    };
	
	public Student(String stand,int age,char sex) {
		this.age=age;
		this.sex=sex;
		this.stand=stand;
	}
	
	
	public String getStand() {
		return stand;
	}
	public void setStand(String stand) {
		this.stand = stand;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}

	//sorting by age
	@Override
	public int compareTo(Student o) {
		return this.age - o.age;
	}

}
