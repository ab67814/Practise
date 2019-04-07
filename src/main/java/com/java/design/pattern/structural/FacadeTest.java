package com.java.design.pattern.structural;

public class FacadeTest {

	public static void main(String[] args) {
		
		HotelKeeper keeper = new HotelKeeper(); 
        
        VegMenu v = keeper.getVegMenu(); 
        NonVegMenu nv = keeper.getNonVegMenu(); 
	}

}
