package com.java8Features.streams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CustomerSerilization {

	
	  public static void main(String[] args) {
		
		  Customer cust=new Customer();
		  
		cust.setName("shalini panday");
		cust.setLocation("siripuram");
		  
		  try {
			  
			  
			  FileOutputStream fStream=new FileOutputStream("C:\\Narendra\\Customer.txt");
			  ObjectOutputStream outputStream=new ObjectOutputStream(fStream);
			  outputStream.writeObject(cust);
			  outputStream.close();
			  fStream.close();
			  System.out.println("Object stored in Char.text");
		  }
		  catch (Exception e) {
		
			  e.printStackTrace();
		}
	}
	  
	
	
}
