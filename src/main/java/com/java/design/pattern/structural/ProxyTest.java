package com.java.design.pattern.structural;

public class ProxyTest {

	public static void main(String[] args) {

	        Internet internet = new ProxyInternet(); 
	        try
	        { 
	            internet.connectTo("geeksforgeeks.org"); 
	            internet.connectTo("abc.com"); 
	        } 
	        catch (Exception e) 
	        { 
	            System.out.println(e.getMessage()); 
	        } 
	}

}
