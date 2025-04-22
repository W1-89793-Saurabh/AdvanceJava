package com.sunbeam.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity

@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "books")
@Data

public class Book {	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String name;
	private String author;
	private String subject;
	private double price;
	
	
	
	
	
	
	
	
	
	
	

}
