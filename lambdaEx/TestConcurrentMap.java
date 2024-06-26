package com.java8Features.lambdaEx;

import java.util.*;

import java.util.concurrent.*;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class TestConcurrentMap extends Thread {

	static ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

	public void run() {
		try {
			Thread.sleep(2000);

		} catch (Exception e) {
			
		}
		System.out.println("Child Thread updating Map");
		map.put(103, "Book");
	}
	
	 

	public static void main(String arg[]) throws InterruptedException {
		map.put(101, "Pen");
		map.put(102, "Bottle");

		TestConcurrentMap t1 = new TestConcurrentMap();
		t1.start();

		KeySetView<Integer, String> keySet = map.keySet();

		Iterator<Integer> iterator = keySet.iterator();

		while (iterator.hasNext()) {

			Integer integer = (Integer) iterator.next();

			System.out.println("Main Thread Iterating Map and Current Entry is:" + integer + "..." + map.get(integer));

			Thread.sleep(3000);

		}
		System.out.println(map);
		
		
		
           /*

		//ConcurrentHashMap
		Map<String,String> myMap = new ConcurrentHashMap<String,String>();
		myMap.put("1", "1");
		myMap.put("2", "1");
		myMap.put("3", "1");
		myMap.put("4", "1");
		myMap.put("5", "1");
		myMap.put("6", "1");
		System.out.println("ConcurrentHashMap before iterator: "+myMap);
		Iterator<String> itr1 = myMap.keySet().iterator();

		while(itr1.hasNext()){
		    String key = itr1.next();
		    if(key.equals("3")) myMap.put(key+"new", "new3");
		}
		System.out.println("ConcurrentHashMap after iterator: "+myMap);

		//HashMap
		myMap = new HashMap<String,String>();
		myMap.put("1", "1");
		myMap.put("2", "1");
		myMap.put("3", "1");
		myMap.put("4", "1");
		myMap.put("5", "1");
		
		myMap.put("6", "1");
		System.out.println("HashMap before iterator: "+myMap);
		Iterator<String> itr2 = myMap.keySet().iterator();

		while(itr2.hasNext()){
		    String key = itr2.next();
		    if(key.equals("3")) myMap.put(key+"new", "new3");
		}
		System.out.println("HashMap after iterator: "+myMap);

              */
	}
}























