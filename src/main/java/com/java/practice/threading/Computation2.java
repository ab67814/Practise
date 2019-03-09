package com.java.practice.threading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class Computation2 implements Runnable 
	{ 
	    public static int sum = 0; 
	    public void run() 
	    { 
	        // check if newBarrier is broken or not 
	        System.out.println("Is the barrier broken? - " + CyclicBarrierTest.newBarrier.isBroken()); 
	        sum = 10 + 20; 
	        try
	        { 
	            CyclicBarrierTest.newBarrier.await(3000, TimeUnit.MILLISECONDS); 
	          
	            // number of parties waiting at the barrier 
	            System.out.println("Number of parties waiting at the barrier "+ 
	            "at this point = " + CyclicBarrierTest.newBarrier.getNumberWaiting()); 
	        }  
	        catch (InterruptedException | BrokenBarrierException e)  
	        { 
	            e.printStackTrace(); 
	        }  
	        catch (TimeoutException e)  
	        { 
	            e.printStackTrace(); 
	        } 
	    } 
	} 

