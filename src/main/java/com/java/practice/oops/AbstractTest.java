package com.java.practice.oops;

public abstract class AbstractTest {

	abstract void printStatus();

	public static void main(String[] args) {
		AbstractTest abstractTest = new AbstractTest() {

			@Override
			void printStatus() {
				System.out.println("test");
			}
		};
		abstractTest.printStatus();
		//abstractTest.main(null);//This will create stackoverflow error
	}
}
