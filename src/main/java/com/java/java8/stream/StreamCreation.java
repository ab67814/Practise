package com.java.java8.stream;

import java.util.Date;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		//Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
		//stream.parallel().forEach(p -> System.out.println(p));
		stream.forEach(p -> System.out.println(p));
		
		IntStream intStream = IntStream.range(1, 3);
		intStream.forEach(p->System.out.println(p));//1,2
		
		IntStream intrangeStream = IntStream.rangeClosed(10, 12);
		intrangeStream.forEach(p->System.out.println(p));//10,11,12
		//Stream Iterate Example
		Stream<Integer> iterateStream = Stream.iterate(40, n->n+2).limit(20);
		iterateStream.forEach(p->System.out.println(p));

		/*//Stream Generate Example
		Stream<Date> dateStream = Stream.generate(() -> { return new Date(); });
		dateStream.forEach(p -> System.out.println(p));*/
	}

}
