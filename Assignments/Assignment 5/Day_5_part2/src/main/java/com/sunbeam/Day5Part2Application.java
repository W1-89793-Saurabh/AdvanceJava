package com.sunbeam;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day5Part2Application implements CommandLineRunner{
	
	 //* | id | name | password | mobile | address | email | birth |
	
	public static void main(String[] args) {
		SpringApplication.run(Day5Part2Application.class, args);
	}
	@Autowired
	private CustomerDao custdao;
	@Override
	public void run(String... args) throws Exception {
		/*
		 * Customers c=new
		 * Customers(12,"rakesh","Punjabi",796347,"pune","raka@gmail.com",Date(
		 * "1970-01-01")); int count=custdao.save(c);
		 */
		/* System.out.println("Insert query :"+count); */
		
		int count1=custdao.changePassword(2,"DMC");
		System.out.println("Pasword Changed "+count1);
		
		Customers c2=custdao.findByEmail("admin@onlinebooks.com");
		System.out.println("Found :"+c2);
		
		List<Customers>list=custdao.findAll();
		list.forEach(System.out::println);
		
		int count2=custdao.deleteById(4);
		System.out.println("delete query :"+count2);
		
		/*
		 * Book b=new Book(54, "THE ARCHER", "PAULO", "NOVEL", 532.56); 
		 * int count=bookDao.update(b); System.out.println(count);
		 */
		Customers c=new Customers(3,"rakesh","Punjabi","796347","pune","raka@gmail.com",new Date(1990,12,5));
		int count3=custdao.update(c);
		System.out.println("Updated :"+count3);
	}

}
