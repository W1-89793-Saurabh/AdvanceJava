package com.sunbeam;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sb07JdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Sb07JdbcApplication.class, args);
	}
	
	@Autowired
	BookDAO bookDAO;

	@Override
	public void run(String... args) throws Exception {
		Book b = new Book(54, "The Archer", "Paulo", "Novel", 632.45);
		int count = bookDAO.save(b );
		System.out.println("Book Inserted: " + count);
		
	}
	
	
	
	
	

}
