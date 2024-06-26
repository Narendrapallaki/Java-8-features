package com.java8Features.lambdaEx;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StreamMethodEx {

	public static void main(String[] args) {

		// Filter
		List<Integer> asList = Arrays.asList(1, 2, 5, 8, 9, 10);
		List<Integer> collect = asList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("A list of even numbers:" + collect);

		asList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		// sorted

		Map<Car, Integer> list = new HashMap<>();

		list.put(new Car("Tata", "Punch", 1250000.00), 1);
		list.put(new Car("Kia", "Kia sonet", 799000.00), 2);
		list.put(new Car("volvo", "XC90", 5000000.00), 3);

		List<Entry<Car, Integer>> collect2 = list.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Car::getPrice).reversed()))
				.collect(Collectors.toList());
		System.out.println("A simple example for sorted method :" + collect2);

		// map
		List<Car> map = new ArrayList<>();

		map.add(new Car("Tata", "Punch", 1250000.00));
		map.add(new Car("Kia", "Kia sonet", 799000.00));
		map.add(new Car("volvo", "XC90", 5000000.00));

		List<String> carResult = map.stream().map(car -> car.getCompany()).collect(Collectors.toList());

		System.out.println("A list of cars with companies names:" + carResult);

		// forEach method example
		List<Integer> forEachEx = Arrays.asList(1, 2, 3, 5, 8, 7);
		forEachEx.stream().forEach(System.out::println);
		// Collect example

		List<String> collec = Arrays.asList("apple", "bananna", "mango", "grapes", "apple2");
		List<String> collectResult = collec.stream().filter(fruits -> fruits.contains("apple"))
				.collect(Collectors.toList());

		System.out.println("A simple example for collect :" + collectResult);

		// count method
		List<Integer> count = Arrays.asList(1, 2, 5, 8, 9, 10);
		long resultOfCount = count.stream().count();

		System.out.println("A simple example for Count :" + resultOfCount);

		// FindFirst method
		List<Integer> numbers = Arrays.asList(2, 9, 3, 4, 5);

		Optional<Integer> firstEven = numbers.stream().filter(num -> num % 2 == 0).findFirst();

		if (firstEven.isPresent()) {
			System.out.println("First even number: " + firstEven.get());
		} else {
			System.out.println("No even number found");
		}

	}

}
