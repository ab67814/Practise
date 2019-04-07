package com.java.design.pattern.structural;

public class DecoratorTest {

	public static void main(String[] args) {
		Pizza pizza = new ToppingDecorator(new PizzaType("Farmhouse",30));
		System.out.println(pizza.getCost());
	}

}
