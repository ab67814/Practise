package com.java.design.pattern.creational;

public class CommercialPlan extends Plan {
	
	@Override  
    public void getRate(){  
        rate=7.50;              
   }  
	
	public AbstractFactory getType() {
		return new CommercialPlan();
	}

}
