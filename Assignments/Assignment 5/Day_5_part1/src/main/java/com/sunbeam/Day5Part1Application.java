package com.sunbeam;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sunbeam.dmc.Book;
import com.sunbeam.dmc.BookDao;

@SpringBootApplication
public class Day5Part1Application implements CommandLineRunner{
    private Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		SpringApplication.run(Day5Part1Application.class, args);
	}
	@Autowired
	private BookDao bookDao;
	@Override
	public void run(String... args) throws Exception {
		
		/* This is save method */
		/*
		 * System.out.println("Enter id :"); int id=sc.nextInt();
		 * System.out.println("Enter name :"); String name=sc.next();
		 * System.out.println("Enter Author :"); String author=sc.next();
		 * System.out.println("Enter Subject :"); String subject=sc.next();
		 * System.out.println("Enter Price :"); double price=sc.nextDouble(); Book b=new
		 * Book(id,name,author,subject,price); int count=bookDao.save(b);
		 * System.out.println("Book Updated :"+count);
		 */
		 
		
		/* This is update method */
		/*
		 * Book b=new Book(54, "THE ARCHER", "PAULO", "NOVEL", 532.56); 
		 * int count=bookDao.update(b); System.out.println(count);
		 */
		
		//this is delete method
		/*
		 * int count=bookDao.deleteById(54);
		 * System.out.println("Delete query update :"+count);
		 */
		
		//this is find all method
		/*
		 * List<Book> list=bookDao.findAll(); list.forEach(System.out::println);
		 */
		
		//this is findbysubject 
		
		
		/*
		 * System.out.print("Enter subject: "); String subject = sc.nextLine();
		 * List<Book> list = bookDao.findBySubject(subject);
		 * list.forEach(System.out::println);
		 */
		
		
		//this is get by ID
		Book b= bookDao.findById(0);
		System.out.println(b);
		
		
		
		
		

		
	}

}
