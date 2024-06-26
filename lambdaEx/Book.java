package com.java8Features.lambdaEx;

import java.util.Objects;

public class Book {

	private int id;
	private String bookName;
	private String author;
	private double price;
	
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String bookName, String author, double price) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getCost() {
		return price;
	}
	public void setCost(double price) {
		this.price = price;
	}
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(author, bookName, id, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(bookName, other.bookName) && id == other.id
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", StudeName=" + bookName + ", SchoolName=" + author + ", age=" + price + "]";
	}
	
	
	
}
