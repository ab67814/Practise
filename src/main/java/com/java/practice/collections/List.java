package com.ritesh.practice.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class List {

	/**
	 * 
	 */
	public static void main(String[] args) {
		java.util.List<String> list = new java.util.ArrayList<>();
		list.add("mahesh");
		list.add("ami");
		Iterator<String> elemIter = list.iterator();
		performLinkedList();
		performVectorList();
		performStackList();
		performConccurrntOperation();
		Insurance insurance = new Insurance("Arogya", "Health");

		java.util.List<Insurance> insuranceList = new ArrayList<>();
		insuranceList.add(insurance);

		while (elemIter.hasNext()) {
			System.out.println(elemIter.next());
			elemIter.remove();

		}

		// Create a link list which stores integer elements
		java.util.List<Integer> l = new LinkedList<Integer>();

		// Now add elements to the Link List
		l.add(2);
		l.add(3);
		l.add(4);

		// Make another Link List which stores integer elements
		java.util.List<Integer> s = new LinkedList<Integer>();
		s.add(7);
		s.add(8);
		s.add(9);

		// Iterator to iterate over a Link List
		for (Iterator<Integer> itr1 = l.iterator(); itr1.hasNext();) {
			for (Iterator<Integer> itr2 = s.iterator(); itr2.hasNext();) {
				if (itr1.next() < itr2.next()) {
					System.out.println(itr1.next());
				}
			}
		}

	}

	private static void performConccurrntOperation() {
		CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();
		arrayList.add("23");
		arrayList.forEach(str -> {
			if (str.equals("23")) {
				arrayList.add("24");
			}
		});
	}

	private static void performStackList() {
		Stack<String> stack = new Stack<>();
		stack.push("12");
		stack.add("13");// uses vector while addition

	}

	private static void performVectorList() {
		Vector<String> vector = new Vector<>();
		vector.add("rag");
	}

	private static void performLinkedList() {
		java.util.List<String> linkedList = new LinkedList<>();
		linkedList.add("Ritesh");
		linkedList.forEach(p -> System.out.println(p));
		linkedList.forEach(System.out::println);
	}

}
