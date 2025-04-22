package com.sunbeam;

import java.util.List;
import java.util.Scanner;

public class Jdbc_Appln {
	static Scanner sc = new Scanner(System.in);
	
	public static void createbook() {
	try(BookDao bookDao = new BookDao()){
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.print("enter name: ");
		String name = sc.next();
		System.out.print("enter author: ");
		String author = sc.next();
		System.out.print("enter subject: ");
		String subject = sc.next();
		System.out.print("enter price: ");
		double price = sc.nextDouble();
		Book b = new Book(id, name, author, subject, price);
		int count = bookDao.createbook(b);
		System.out.println("Books Inserted: " + count);		
	} 
	catch (Exception e) {
		e.printStackTrace();
	}

	}
	

	public static void updateBook() {
		try(BookDao bookDao = new BookDao()) {
			System.out.print("enter book id to update: ");
			int id = sc.nextInt();
			System.out.print("enter new name: ");
			String name = sc.next();
			System.out.print("enter new author: ");
			String author = sc.next();
			System.out.print("enter new subject: ");
			String subject = sc.next();
			System.out.print("enter new price: ");
			double price = sc.nextDouble();
			Book b = new Book(id, name, author, subject, price);
			int count = bookDao.updatebook(b);
			System.out.println("Books Updated: " + count);
		} // bookDao.close();
		catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	
	public static void findAllbooks() throws Exception {
		try(BookDao bookDao = new BookDao()){
			List<Book> list = bookDao.findAllbooks();
			for(Book book : list ) {
				System.out.println(book.toString());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}


	public static void findBookById() {
	try(BookDao bookDao = new BookDao()) {
		System.out.print("enter book id to find: ");
		int id = sc.nextInt();
		Book b = bookDao.findById(id);
		if(b == null)
			System.out.println("Book Not Found");
		else
			System.out.println("Found " + b.toString());
	} // bookDao.close();
	catch (Exception e) {
		e.printStackTrace();
	}		
}

	public static void deleteBookById() {
		try(BookDao bookDao = new BookDao()) {
			System.out.print("Enter Book Id to delete: ");
			int bookId = sc.nextInt();
			int count = bookDao.deleteById(bookId);
			System.out.println("Books Deleted: " + count);
		} // bookDao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void findBookBySubject() throws Exception {
		try (BookDao bookDao = new BookDao()){
			System.out.println("Enter book Subject to find: ");
			String subject  = sc.next();
			Book b = bookDao.findBookBySubject(subject);
			if (b == null)
				System.out.println("Book not Found");
			else 
				System.out.println("Found " + b.toString());
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}


	
	public static void main(String[] args)  {
		findBookBySubject();
		
	}
}