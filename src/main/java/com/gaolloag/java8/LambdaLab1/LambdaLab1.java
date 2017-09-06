package com.gaolloag.java8.LambdaLab1;

import java.util.Arrays;

public class LambdaLab1 {


	public static void main(String args[]) {
		String str = ",";
		Arrays.asList("a","b","c").forEach( e -> System.out.println(e));
		Arrays.asList("a","b","c").forEach( e -> {
			System.out.println(e + str);
			System.out.println(e);
		});

		Arrays.asList("a","b","c").sort( (e1,e2) -> e1.compareTo(e2));

	}
}
