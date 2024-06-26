package com.java8Features.streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CustDesirilization {
	
	
	public static void main(String[] args)  throws IOException,ClassNotFoundException{
		
		
		Customer cust=null;
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Narendra\\Customer.txt");
			ObjectInputStream oIs=new ObjectInputStream(fis);
			
			cust= (Customer) oIs.readObject();
			oIs.close();
			fis.close();
			
		}
		finally {
			System.out.println("Data convert byte to object....!");
			
			System.out.println(cust.getLocation()+","+cust.getName());
		}
		
		
		
	}

}
