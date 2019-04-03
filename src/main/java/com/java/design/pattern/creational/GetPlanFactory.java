package com.java.design.pattern.creational;

public class GetPlanFactory {

	// use getPlan method to get object of type Plan
	public static Plan getPlan(String planType) {
		if (planType == null) {
			throw new IllegalArgumentException();
		}
		if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		} else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
			return new CommercialPlan();
		}
		return null;
	}

}
