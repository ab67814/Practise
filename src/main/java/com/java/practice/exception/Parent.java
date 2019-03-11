package com.java.practice.exception;

import java.io.IOException;

public class Parent {
	void msg() throws IOException {
		System.out.println("parent");
	}

}

class TestExceptionChild extends Parent {
	void msg() throws IOException {
		System.out.println("TestExceptionChild");
	}

	public static void main(String args[]) throws IOException {
		Parent p = new TestExceptionChild();
		p.msg();
	}
}

class ExceptionChild extends Parent {
	void msg() throws ArithmeticException {
		System.out.println("TestExceptionChild");
	}
	/*void msg() {
		System.out.println("TestExceptionChild");
	}*/

	public static void main(String args[]) throws IOException {
		Parent p = new TestExceptionChild();
		p.msg();
	}
}