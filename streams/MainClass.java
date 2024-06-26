package com.java8Features.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		List<Movie> list = new ArrayList<>();
		list.add(new Movie("Athadu", 7.5, 2015));

		list.add(new Movie("Arjun", 6.5, 2017));
		list.add(new Movie("Srimanthudu", 8.5, 2019));
		
		Collections.sort(list);
		
		for (Movie movie : list) {
			
			
			System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
		}
		System.out.println("---------------------");
		
		
		List<User>li=new ArrayList<>();
		li.add(new User("shalini padey", 23, "siripuram"));
		li.add(new User("Rohith ", 30, "Mumbai"));
		li.add(new User("Modi reddy", 24, "marripudi"));
		
		Collections.sort(li,new UserComparator());
		
		for (User user : li) {
			System.out.println(user);
		}
	}
}
