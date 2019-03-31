package com.java.design.pattern;

import java.io.Serializable;

public enum SingeltonTest implements Serializable {

	INSTANCE("Initial class info");

	private String info;

	private SingeltonTest(String info) {
		this.info = info;
	}

	protected Object readResolve() {
		return INSTANCE;
	}

}
