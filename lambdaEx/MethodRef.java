package com.java8Features.lambdaEx;

import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

interface Pen {

	Movie write(String name);
}

interface EX {

	int test(int a, int b);
}

interface Book1 {

	void readBook(String book);
}

class bag {

	void bookReading(String str) {
		System.out.println(str);
	}

}

class Movie {
	public String name;

	public Movie(String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class MethodRef {

	static int result(int i, int b) {
		return i + b;
	}

	public static void main(String[] args) {

		bag bk = new bag();

		// Static method reference
		EX e = MethodRef::result;
		System.out.println("Addition of two is :" + e.test(26, 07));
		
		// instance of a particular object
		Book1 b1 = bk::bookReading;
		b1.readBook("The future thinks");
		
		// Constructor reference
		Pen p1 = Movie::new;
		Movie m1 = p1.write("Athadu");
		System.out.println(m1.getName());

		 ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
	        map.put("key", null);
	        System.out.println(map); 
		
	
	}

}
