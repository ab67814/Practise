package com.java.design.pattern.structural;

public class HotelKeeper {

	public VegMenu getVegMenu() {
		// TODO Auto-generated method stub
		return (VegMenu) new VegMenu().getMenus();
	}

	public NonVegMenu getNonVegMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
