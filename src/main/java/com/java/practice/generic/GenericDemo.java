package com.java.practice.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericDemo<T> implements DemoInterface<String, Integer>{
	
	private T length;
	
	public GenericDemo(T length) {
		super();
		this.length = length;
		// TODO Auto-generated constructor stub
	}
	
	Collection<?> coll = new ArrayList<String>(); // unbounded wild card
	List<? extends Number> list = new ArrayList<Long>();// Upper bounded wild card

	public static void main(String[] args) {
		Integer[] arrayList = new Integer[10];
	countAllOccurrences(arrayList, 10);
	
	 //List of grand children
    List<GrandChildClass> grandChildren = new ArrayList<GrandChildClass>();
    grandChildren.add(new GrandChildClass());
    addGrandChildren(grandChildren);
     
    //List of grand childs
    List<ChildClass> childs = new ArrayList<ChildClass>();
    childs.add(new GrandChildClass());
    addGrandChildren(childs);
     
    //List of grand supers
    List<SuperClass> supers = new ArrayList<SuperClass>();
    supers.add(new GrandChildClass());
    addGrandChildren(supers);
		
	}
	public static void addGrandChildren(List<? super GrandChildClass> grandChildren) 
	   {
	      grandChildren.add(new GrandChildClass());
	      System.out.println(grandChildren);
	   }
	
	private static Number sum(List<? extends Number> numbers){
	      double s = 0.0;
	      for (Number n : numbers)
	         s += n.doubleValue();
	      return s;
	   }
	
	public static <T> int countAllOccurrences(T[] list, T item) {
		   int count = 0;
		   if (item == null) {
		      for ( T listItem : list )
		         if (listItem == null)
		            count++;
		   }
		   else {
		      for ( T listItem : list )
		         if (item.equals(listItem))
		            count++;
		   }
		   return count;
		}   
	
	@Override
	public Integer doSomeOperation(String t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String doReverseOperation(Integer t) {
		// TODO Auto-generated method stub
		return null;
	}

}
