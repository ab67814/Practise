package com.java.design.pattern.structural;

public class PizzaType implements Pizza {
	
	private String type;
	private int rate;

	public PizzaType(String type,int rate) {
		this.setType(type);
		this.setRate(rate);
	}

	@Override
	public int getCost() {
		return this.getRate();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	
	

}
