package com.java8Features.lambdaEx;

import java.util.ArrayList;
import java.util.List;

public class DataGet {

	public static List<Book> list() {

		List<Book> book = new ArrayList<>();
		
		
		book.add(new Book(5, "ghj", "ggg", 21));
		book.add(new Book(4, "ghj", "ggg", 22));
		book.add(new Book(6, "ghj", "ggg", 19));
		
		return book;
	}

}
