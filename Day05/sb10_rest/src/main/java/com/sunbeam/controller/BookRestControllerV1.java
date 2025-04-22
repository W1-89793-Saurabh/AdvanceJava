package com.sunbeam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.Dao.BookDao;
import com.sunbeam.entity.Book;

@RequestMapping("/V1")
@RestController
public class BookRestControllerV1 {

	@Autowired
	private BookDao bookDao;
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		List<Book> List = bookDao.findAll();
		return List;
	}
	
	@GetMapping("/books/{id}")
	public Book getBookById(@PathVariable("id") int id) {
		Book b = bookDao.findById(id);
		return b;
	}
	
	@PostMapping("/books")
	public String saveBook(@RequestBody Book b) {
		int count = bookDao.save(b);
		if(count==1)
			return "Book Updated";
		return "Book Not Updated";
	}
	
	// modify the record
	@PutMapping("/books/{id}")
	public String updateBook(@PathVariable("id") int id, @RequestBody Book b) {
		b.setId(id); // store id in pojo (coming from url)
		int count = bookDao.update(b);
		if(count == 1)
			return "Book Updated";
		return "Book Not Updated";		
	}
	
	// modify partial record
	@PatchMapping("/books/{id}")
	public String updateBookPrice(@PathVariable("id") int id, @RequestBody Book b) {
		int count = bookDao.updatePrice(id, b.getPrice());
		if(count == 1)
			return "Book Price Updated";
		return "Book Price Not Updated";		
	}
	
	// delete by id
	@DeleteMapping("/books/{id}")
	public String deleteBook(@PathVariable("id") int id) {
		int count = bookDao.deleteById(id);
		if(count == 1)
			return "Book Deleted";
		return "Book Not Deleted";		
	}
	
}
