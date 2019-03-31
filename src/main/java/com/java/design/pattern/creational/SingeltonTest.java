package com.java.design.pattern.creational;

import java.io.Serializable;

public enum SingeltonTest implements Serializable,Cloneable {

	INSTANCE("Initial class info");

	private String info;

	private SingeltonTest(String info) {
		this.info = info;
	}

	protected Object readResolve() {
		return INSTANCE;
	}
	//just for understanding
	public Object clone(String t) throws CloneNotSupportedException {
		return super.clone();
		
	}
	
}
