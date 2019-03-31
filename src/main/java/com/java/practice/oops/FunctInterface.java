package com.java.practice.oops;

@FunctionalInterface
public interface FunctInterface {
	
	abstract void computeExpression(int n);
	
	default String getValue () {
		return "joh";
	}
	
	static void computeSize() {
		System.out.println("here calculating size");
	}
	
	 default void abstra() {
		 System.out.println("rama");
	 }
}
