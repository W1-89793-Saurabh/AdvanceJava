package com.sunbeam.daos;

import java.util.List;

import com.sunbeam.entity.Book;

public interface BookDao {
	int create(Book b);
	int update(Book b);
	int deleteById(int id);
	List<Book> findAllBooks();
	List<Book> findBookById(int id);
}
