package com.java.practice.oops;

public class CloneTest implements Cloneable {
	
	private String name;
	private String city;
	private Student student;
	private int data1=90;
	
	public CloneTest(String name,String city,Student student) {
		this.name=name;
		this.city=city;
		this.student=student;
	}
	
	void add(int data) {
		this.data1=data+data1;
		System.out.println(this.data1);
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		CloneTest clone = (CloneTest) super.clone();
		clone.setStudent(new Student(clone.getStudent().getStand(), clone.getStudent().getAge(), clone.getStudent().getSex()));
		return clone;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Student	 student = new Student("four", 12, 'm');
		CloneTest cloneTest = new CloneTest("Ritesh","Chennai",student);
		CloneTest clone = (CloneTest) cloneTest.clone();
		clone.getStudent().setAge(10);
		cloneTest.setName("krishna");
		System.out.println(clone.equals(cloneTest));
		cloneTest.add(10);
		System.out.println(cloneTest.data1);

	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}

}
