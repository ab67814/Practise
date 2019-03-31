package com.java.design.pattern.creational;

import java.io.Serializable;

public class Singelton implements Serializable,Cloneable {

	/**
	 * @auto generated serialVersionUID by JVM
	 */
	private static final long serialVersionUID = -6659980965985679796L;

	private static Singelton instance;

	private Singelton() {
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		SingeltonTest cloneableTest = SingeltonTest.INSTANCE;
		cloneableTest.clone("");


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
	
	public Object clone() throws CloneNotSupportedException  {
		return super.clone();
	}
}
