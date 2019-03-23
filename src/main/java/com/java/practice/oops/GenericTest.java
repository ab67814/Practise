package com.java.practice.oops;

import java.util.List;

public class GenericTest<T, Z> {

	public GenericTest() {
	}

	public GenericTest(T a, Z b, T c) {
	}

	// T - Type
	// E - Element
	// K - Key
	// N - Number
	// V - Value

	// A Generic method example
	static <E> void genericDisplay(E element) {
		System.out.println(element.getClass().getName() + " = " + element);
	}

	public static<T extends Student> void printStudent(T studentElem) {
		System.out.println(studentElem);
	}
	
	public  void printStudent(List<? super Student> studentElem) {
		System.out.println(studentElem);
	}
	public  void printStudent(Instrument<? super Student> studentElem) {
		System.out.println(studentElem);
	}

	public static void printData(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + "::");
		}
	}

	public static void main(String[] args) {

		GenericTest.genericDisplay(12L);

		GenericTest<Object, Object> obj = new GenericTest<Object, Object>();
		obj.printStudent(new Instrument<Student>());
	}

}
