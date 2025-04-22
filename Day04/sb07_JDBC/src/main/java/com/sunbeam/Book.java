package com.sunbeam;



//import lombok.Data;

//@Data
public class Book {

	
	
//	@Id //PrimaryKey
	private int id;
	private String name;
	private String author;
	private  String Subject;
	private double price;
	


public Book() {
	}

public Book(int id, String name, String author, String subject, double price) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
	Subject = subject;
	this.price = price;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getSubject() {
	return Subject;
}

public void setSubject(String subject) {
	Subject = subject;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", author=" + author + ", Subject=" + Subject + ", price=" + price
			+ "]";
}


	
}
