package com.java.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamMap {

	public static void main(String[] args) {
		List<String> memberNames=  new ArrayList<>();
		memberNames.add("ritesh");memberNames.add("mahesh");
		memberNames.stream().filter((s) -> s.startsWith("m"))
        .map(String::toUpperCase)
        .forEach(System.out::println);
		memberNames.stream().sorted().forEach(e->System.out.println(e));
	}

}
