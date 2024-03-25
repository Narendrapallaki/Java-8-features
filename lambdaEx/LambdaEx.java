package com.java8Features.lambdaEx;

interface nook {

	int read(int a, int b);
}

public class LambdaEx {

	public static void main(String[] args) {
		
		nook b2 = (a, b) -> { return a + b; };
		System.out.println(b2.read(5, 6));

	}
}
