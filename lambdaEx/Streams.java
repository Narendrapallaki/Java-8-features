package com.java8Features.lambdaEx;


import java.util.Arrays;

import java.util.List;

import java.util.Optional;
import java.util.stream.Collectors;


public class Streams {
	
	
	public static void main(String[] args)
	{
		
		
		/*
		     // List<Integer> asList = Arrays.asList(2,4,8,10);  
		     // asList.stream().forEach(result ->System.out.println("Result of asList :"+result));
		// Integer filter in to arrays list
		 List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9); 
		 List<Integer> collect = asList.stream()
		                  .filter(s1 -> s1%2==0)
		                  .collect(Collectors.toList());
		              
		 System.out.println(collect);
		
		
		 
		 // filter out only the one element in to the string arrays
		  List<String> asList1 = Arrays.asList("ram", "sai", "hanuman", "superman","sai");

	        // Filter out only "ram" and collect it into a list
	        List<String> filteredList = asList1.stream()
	                                          .filter(s -> s.equals("sai")) 
	                                          .collect(Collectors.toList()); 

	        // Print the filtered list
	        System.out.println("Filtered list: " + filteredList);
	        
	        
	        
	        */
		
	/*	  Map<Book, Integer>response=new HashMap<>();
		  
		  response.put(new Book(4, "Vasu", "Jntuk", 22), 1);
		  response.put(new Book(5, "Jaswant", "KL univesity", 21), 4);
		  response.put(new Book(8, "Narenda", "Jntuh", 19), 3);
		  response.put(new Book(3, "kasi", "vit", 20), 2);

		  response.entrySet().stream()
		       .sorted(Map.Entry.comparingByKey(Comparator.comparing(Book::getCost)
			   )).forEach(System.out::println);
		  
		  */
		 // System.out.println("-----------------------");
		  
		
		  
		  
		  
		  
	//	Stream<T>lists=new Stream<T>;
		 
		 List<Book> list = DataGet.list();
		  
		  
		  List<String> collect = list.stream()
				  .map(lists -> lists.getAuthor())
				  .collect(Collectors.toList());
		  
		  System.out.println("List of authors :"+collect);
		  
		  
		  
		  
		  
		/*  List<String> asList = Arrays.asList("may","june","july","april");
		  
		  asList.stream()
		  .forEach(day -> System.out.println("Month of year is " + day + "!"));
		  */
		  
	/*	  List<String> asList = Arrays.asList("may","june","july","april","December");
		  
		  List<String> result = asList.stream().filter(month -> month.length()<=4).collect(Collectors.toList());
		  
		  System.out.println("Less than 4 digits of month in a year is :"+result);
		  
		  */
		  
		/*  List<Integer> asList = Arrays.asList(2,4,8,10,11,1,12,15,16);  
		  
		  
		  long count = asList.stream().count();
		  System.out.println("Length of an arrays is :"+count);*/
		  
		  
		 
			/*        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

			        
			        boolean anyMatch = numbers.stream()
			                                  .anyMatch(num -> num > 3);
			        System.out.println("Any number greater than 3? " + anyMatch);

			       
			        boolean allMatch = numbers.stream()
			                                  .allMatch(num -> num % 2 == 0);
			        System.out.println("All numbers are even? " + allMatch);

			    
			        boolean noneMatch = numbers.stream()
			                                   .noneMatch(num -> num < 0);
			        System.out.println("No negative numbers? " + noneMatch);    */
		  
		  
		  
		/*  List<Integer> numbers = Arrays.asList(1, 9, 3, 4, 5);

	      
	        Optional<Integer> firstEven = numbers.stream()
	                                             .filter(num -> num % 2 == 0)
	                                             .findFirst();
	        
	       
	        if (firstEven.isPresent()) {
	            System.out.println("First even number: " + firstEven.get());
	        } else {
	            System.out.println("No even number found");
	        }
		  */
		  
		  List<String> numbers = Arrays.asList("1","2,","3","4");

	        // Calculate the sum of all numbers in the list
	        Optional<String> sum = numbers.stream()
	                                      .reduce((a, b) -> a + b);
	        
	        // Print the sum if present
	        if (sum.isPresent()) {
	            System.out.println("Sum of all numbers: " + sum.get());
	        } else {
	            System.out.println("List is empty");
	        }
		  
		
	}
}
