package com.java.practice.oops;

public class GenericTest<T,Z> {
	
	public GenericTest() {
	}
	
	public GenericTest(T a,Z b,T c) {
	}
	
	// A Generic method example 
    static <T> void genericDisplay (T element) 
    { 
        System.out.println(element.getClass().getName() + 
                           " = " + element); 
    } 

	public static void main(String[] args) {
		
		GenericTest.genericDisplay(12L);
		
		GenericTest<Object,Object> obj = new GenericTest();
		
	}

}
