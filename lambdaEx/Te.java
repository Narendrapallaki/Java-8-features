package com.java8Features.lambdaEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Te {

	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * 
	 * String inputString = "banana"; Map<Character, Integer> charCount = new
	 * HashMap<>();
	 * 
	 * // charCount.get(charCount) // Count the frequency of each character for
	 * (char c : inputString.toCharArray()) { if (charCount.containsKey(c)) {
	 * charCount.put(c, charCount.get(c) + 1); //
	 * System.out.println(charCount.get(c)+1); } else { charCount.put(c, 1); }
	 * System.out.println(charCount); }
	 * 
	 * 
	 * // Find duplicates and store them in a map Map<Character, Integer> duplicates
	 * = new HashMap<>(); for (Map.Entry<Character, Integer> entry :
	 * charCount.entrySet()) { if (entry.getValue() > 1) {
	 * duplicates.put(entry.getKey(), entry.getValue()); } }
	 * 
	 * System.out.println(duplicates); // Print duplicates if
	 * (!duplicates.isEmpty()) { System.out.println("Duplicates found:"); for
	 * (Map.Entry<Character, Integer> entry : duplicates.entrySet()) {
	 * System.out.println("'" + entry.getKey() + "' appears " + entry.getValue() +
	 * " times."); } } else {
	 * System.out.println("No duplicates found in the string."); } }
	 */

	public static void main(String[] args) {

		List<Book> user = new ArrayList<>();
		user.add(new Book(1, "abc", "123", 350));
		user.add(new Book(2, "def", "456", 370));
		user.add(new Book(3, "ghi", "789", 340));
		user.add(new Book(4, "jkl", "563", 310));
		user.add(new Book(1, "abc", "123", 350));
		
		
		Map<Book, Integer>result=new HashMap<>();
		for (Book book : user) {
			
			if (!result.containsKey(book)) {
				
				result.put(book, 1);
				
			}
			else
			{
				result.put(book, result.get(book)+1);
				
			}
			
		}
		
		for (Map.Entry<Book, Integer> entry : result.entrySet()) {
		
			if (entry.getValue()>1) {
				System.out.println("Object is :"+entry.getKey()+" Count is :"+entry.getValue());
			}
			
		}
		
	}

}
