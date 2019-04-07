package com.java.design.pattern.creational;

abstract class Plan implements AbstractFactory{  
	
    protected double rate;  
    abstract void getRate();  

    public void calculateBill(int units){  
         System.out.println(units*rate);  
     }  
    
}