package com.java.design.pattern.creational;

public class FactoryType {
	
	public AbstractFactory abstractFactory(AbstractFactory abstractFactory) {
		return abstractFactory.getType();
	}

}
