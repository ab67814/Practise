package com.java.practice.generic;

public interface DemoInterface<T1, T2> {
	
	T2 doSomeOperation(T1 t);
	T1 doReverseOperation(T2 t);
	//private static T1 member; //This is not allowed
}
