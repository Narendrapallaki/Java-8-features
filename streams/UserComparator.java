package com.java8Features.streams;

import java.util.*;

public class UserComparator implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		return  o1.getLocation().compareTo(o2.getLocation());
	}

	

	

}
