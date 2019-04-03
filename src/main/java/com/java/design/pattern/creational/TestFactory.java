package com.java.design.pattern.creational;

public class TestFactory {

	public static void main(String[] args) {
		Plan plan = GetPlanFactory.getPlan("DOMESTICPLAN");
		System.out.println("domestic plan"+plan.rate);
		plan = GetPlanFactory.getPlan("COMMERCIALPLAN");
		System.out.println("commercial plan"+plan.rate);
	}

}
