package com.java.design.pattern.creational;

public class TestFactory {

	public static void main(String[] args) {
		
		Plan plan = PlanFactory.getPlan("DOMESTICPLAN");
		plan.getRate();
		System.out.println("domestic plan"+plan.rate);
		
		plan = PlanFactory.getPlan("COMMERCIALPLAN");
		plan.getRate();
		System.out.println("commercial plan"+plan.rate);
	}

}
