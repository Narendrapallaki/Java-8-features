package com.java8Features.lambdaEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

interface LE {

	int test(int i1, int i2);

}

interface ML {

	double multiplecation(int i, int m);
}

public class LambdaExpresion {

	static int result(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {

		/*
		 * List<Integer> list = new ArrayList<>(); list.add(2); list.add(3);
		 * list.add(5); list.add(8); list.forEach(n -> System.out.println(n));
		 * 
		 * list.forEach(even -> {
		 * 
		 * if (even % 2 == 0) { System.out.println("Even number's :" + even); } } );
		 */

//		// multiperameter lambda expression
//		LE e = ((int a, int b) -> System.out.println(a + b));
//		e.test(26, 07);

		ML mul = (i, m) -> {
			return i * m;
		};
		System.out.println(mul.multiplecation(5, 6));

		LE e = LambdaExpresion::result;
		System.out.println(e.test(5, 6));

	}
}
