package com.java8Features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethod {

	public static void main(String[] args) {

		// Creating a list of integers from 1 to 10
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Using stream() to obtain a Stream<Integer> from the list
		List<Integer> result = asList.stream()
				// Using filter() to include only even numbers
				.filter(a -> a % 2 == 0) // Predicate to check if the number is even
				// Collecting the filtered numbers into a new list
				.collect(Collectors.toList());
		  
		// Printing the filtered even numbers
		System.out.println("Even numbers :" + result);
	}
}
