package com.ritesh.practice.collections;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {

		java.util.Map<String, String> map = new HashMap<>();
		map.put("1", "John");
		int i=2&2;
		System.out.println(i);
		Insurance insu1 = new Insurance("Abhi", "Gen");
		Insurance insu2 = new Insurance("Abhi", "Gen");
		System.out.println(insu1.equals(insu2));

		
		java.util.Map<Insurance, String> insuranceMap = new HashMap<>();
		insuranceMap.put(insu1,"first");
		insuranceMap.put(insu2,"secnd");
		
System.out.println(insuranceMap);

	}

}
