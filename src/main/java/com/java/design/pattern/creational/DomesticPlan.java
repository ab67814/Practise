package com.java.design.pattern.creational;

public class DomesticPlan extends Plan{

	@Override  
    public void getRate(){  
        rate=3.50;              
   }  
	
	public AbstractFactory getType() {
		return new DomesticPlan();
	}

}
