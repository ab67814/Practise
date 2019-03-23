package com.java.practice.oops;

public class Student {
	
	
	private String stand;
	private int age;
	private char sex;
	
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

}
