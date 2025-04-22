package com.sunbeam.services;
import java.util.List;
import java.util.Optional;
import com.sunbeam.entities.Book;


public interface BookServices {
	
	List<Book> getAllBooks();
	
	Optional<Book> getBookByid(int id);	
	int addBook(Book b);
	int updateBook(Book b);
	int updateBookByprice(double price,int id);
	int deleteBookByid(int id);
	
	
	

}
