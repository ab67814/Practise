package com.java.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class AnyMatch {

	public static void main(String[] args) {
		
		List<String> memberNames=  new ArrayList<>();
		memberNames.add("ritesh");memberNames.add("mahesh");memberNames.add("mukesh");
		boolean matchedResult = memberNames.stream()
                .anyMatch((s) -> s.startsWith("r"));

System.out.println(matchedResult);

matchedResult = memberNames.stream()
                .allMatch((s) -> s.startsWith("A"));

System.out.println(matchedResult);

matchedResult = memberNames.stream()
                .noneMatch((s) -> s.startsWith("t"));

System.out.println(matchedResult);
	}

}
