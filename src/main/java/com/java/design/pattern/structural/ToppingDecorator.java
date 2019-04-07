package com.java.design.pattern.structural;

public class ToppingDecorator extends PizzaType {
	
	private PizzaType pizzaType;

	public ToppingDecorator(PizzaType type) {
		super(type.getType(),type.getRate());
	}
	
	public int getCost() {
		return super.getCost()+20;
	}

	public PizzaType getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(PizzaType pizzaType) {
		this.pizzaType = pizzaType;
	}
	
	
	

}
