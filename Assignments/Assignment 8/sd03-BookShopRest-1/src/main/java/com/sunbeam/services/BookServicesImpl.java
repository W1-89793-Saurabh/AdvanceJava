package com.sunbeam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sunbeam.daos.BookDao;
import com.sunbeam.entities.Book;

@org.springframework.transaction.annotation.Transactional
@Service

public class BookServicesImpl implements BookServices{
	
	@Autowired
	private BookDao bookdao;

	@Override
	public List<Book> getAllBooks() {	
		List<Book> list = bookdao.findAll();
		return list;
	}
	

	@Override
	public Optional<Book> getBookByid(int id) {		
		Optional<Book> bk = bookdao.findById(id);		
		return bk;
	}
	
	

	@Override
	public int addBook(Book b) {
		Book m = bookdao.save(b);
		if(m!=null)
			return 1;
		return 0;
	}

	@Override
	public int updateBook(Book b) {
		
		Book bk= bookdao.save(b);
		if(bk!=null)
			return 1;
		return 0;	
	}
	
	

	@Override
	public int updateBookByprice(double price, int id) {		
		int count = bookdao.updateBookPriceById(price, id);			
		return count ;
	}

	@Override
	public int deleteBookByid(int id) {
		if(bookdao.existsById(id)) {
			bookdao.deleteById(id);
			return 1;
		}
		return 0;
	}

}
