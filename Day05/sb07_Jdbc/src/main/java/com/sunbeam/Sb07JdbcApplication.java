package com.sunbeam;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sunbeam.dao.BookDao;
import com.sunbeam.dao.CustomerDao;
import com.sunbeam.entity.Book;
import com.sunbeam.entity.Customer;


@SpringBootApplication
public class Sb07JdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Sb07JdbcApplication.class, args);
	}
	
	@Autowired
	private BookDao bookDao;
	@Autowired
	private CustomerDao custDao;

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Books price getter than ");
		int price = sc.nextInt();
		List<Book> list = bookDao.findByPrice(price);
		list.forEach(System.out::println);
		
//		Book b = new Book( 55 , "shodog" , "Paul nik" , "Novel" , 602.40);
//		int count =bookDao.save(b);
//		System.out.println("Books Updated:" + count);
	
//	System.out.print("Enter subject: ");
//	String subject = sc.nextLine();
//	List<Book> list = bookDao.findBySubject(subject);
//	list.forEach(System.out::println);

//	System.out.print("Enter email: ");
//	String email = sc.nextLine();
//	Customer cust = custDao.findByEmail(email);
//	System.out.println("Found : " + cust);
		
	}

}
