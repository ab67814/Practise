package com.java.design.pattern;

import java.io.Serializable;

public class Singelton implements Serializable {

	/**
	 * @auto generated serialVersionUID by JVM
	 */
	private static final long serialVersionUID = -6659980965985679796L;

	private static Singelton instance;

	private Singelton() {
	}

	public static void main(String[] args) {
		

	}

	public static Singelton getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (Singelton.class) {
				if (instance == null) {
					instance = new Singelton();
				}
			}
		}
		return instance;
	}
	
	protected Object readResolve() {
        return getInstanceUsingDoubleLocking();
    }
}
