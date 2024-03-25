package com.java8Features.lambdaEx;

public class Car {

	
	 public String company;
	 public String model;
	 public double price;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String company, String model, double price) {
		super();
		this.company = company;
		this.model = model;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", price=" + price + "]";
	}
	 
	 
}
