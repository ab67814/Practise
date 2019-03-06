package com.ritesh.practice.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		java.util.Queue<Integer> q = new LinkedList<>(); 
		q.add(1);
		q.add(2);
		q.remove();
		System.out.println(q);
		
		java.util.Queue<Integer> priorityQ =new PriorityQueue<>();  
		priorityQ.add(1);
		priorityQ.add(2);
		System.out.println(priorityQ);
		
		
	}

}
