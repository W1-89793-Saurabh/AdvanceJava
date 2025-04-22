package com.sunbeam.dmc;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
	private int id;
	private String name;
	private String author;
	private String subject;
	private double price;

}
