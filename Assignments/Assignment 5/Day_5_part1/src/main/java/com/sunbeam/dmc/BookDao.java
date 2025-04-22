package com.sunbeam.dmc;

import java.util.List;

public interface BookDao {
	int save(Book b);
	int update(Book b);
	int deleteById(int id);
	List<Book> findAll();
	List<Book> findBySubject(String subject);
	Book findById(int bookId);

}
