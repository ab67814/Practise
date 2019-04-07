package com.java.design.pattern.structural;

public class ActInternet implements Internet {

	@Override
    public void connectTo(String serverhost) 
    { 
        System.out.println("Connected to "+ serverhost); 

    } 
}
