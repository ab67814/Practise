package com.java.practice.oops;

public class Inheritance {

	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, int b) {
		return b;
	}

	{
		System.out.println("instance initializer block invoked");
	}
	static {
		System.out.println("static ");
	}

	class A {

		private String name1;

		public String occupation;

		public String getName1() {
			return name1;
		}

		public void dummy() {
			System.out.println("dummy");
		}

		public void setName1(String name) {
			this.name1 = name;
		}
	}

	class B extends A {
		private String rollno;

		int count = 20;

		public String getRollno() {
			return rollno;
		}

		public void setRollno(String rollno) {
			this.rollno = rollno;
		}

	}

	class C extends B {
		private String name;

		int count = 30;

		public String getName() {
			return name;
		}

		public C() {
			super.dummy();
		}

		public void setName(String name) {
			this.name = super.rollno;
			this.name = name;
		}

	}

	public static void main(String[] args) {

		C name = new Inheritance().new C();
		System.out.println(name instanceof A);
		System.out.println(name.count);
		B b = name;
		System.out.println(b.count);
		name.getRollno();
		name.getName();
		
		String status="hi1";
		System.out.println("status "+!(!status.equalsIgnoreCase("ap") || !status.equalsIgnoreCase("hi")));
	}
}
