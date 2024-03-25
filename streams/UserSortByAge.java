package com.java8Features.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserSortByAge {
	
	
	public static void main(String[] args) {
		
		
		
		List<User>users=new ArrayList<>();
		users.add(new User("Alice", 25, "abc"));
        users.add(new User( "Bob", 30, "def"));
        users.add(new User( "Charlie", 22, "ghi"));
        users.add(new User("David", 28, "jkl"));
        
        Collections.sort(users);
        
        for (User user : users) {
			
        	System.out.println(user);
		}
        System.out.println();
        Map<User,Integer>map=new HashMap<>();
        map.put(new User("Alice", 25, "abc"), 2);
        map.put(new User("Bob", 30, "def"), 3);
        map.put(new User("Charlie", 22, "ghi"), 4);
        map.put(new User("David", 28, "jkl"), 7);
        map.put(new User("Charlie", 22, "ghi"), 6);
        
      
       
//        map.entrySet().stream()
//        .sorted(Map.Entry.comparingByKey(Comparator.comparing(User::getAge)))
//        .forEach(System.out::println);
        
       
        
        
       
      
	}

}
