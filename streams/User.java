package com.java8Features.streams;

public class User implements Comparable<User>{
	
	public String name;
	public int age;
	public String location;

	public User(String name, int age, String location) {
		super();
		this.name = name;
		this.age = age;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "UserComparator [name=" + name + ", age=" + age + ", location=" + location + "]";
	}

	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.age, o.age);
	}

}
