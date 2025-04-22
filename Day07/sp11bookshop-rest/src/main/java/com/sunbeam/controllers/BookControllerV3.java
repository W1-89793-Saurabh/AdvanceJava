package com.sunbeam.controllers;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.daos.BookDao;
import com.sunbeam.entity.Book;

@RequestMapping("/V3")
@RestController
public class BookControllerV3 {
	
	@Autowired
	private BookDao bookDao;
	
	@GetMapping("/books")
	public HashMap<String, Object> getAllBooks() {
		List<Book> list = bookDao.findAllBooks();
		HashMap<String, Object> result  = new  HashMap<>();
		result.put("status", "success");
		result.put("data", list);
		return result;
	}
	
	@GetMapping("/books/{id}")
	public HashMap<String, Object> getBookById(@PathVariable("id") int id) {
		List<Book> b = bookDao.findBookById(id);
		HashMap<String, Object> result = new HashMap<>();
		if(b != null) {
			result.put("status", "success");
			result.put("data", b);
		} else {
			result.put("status", "error");
			result.put("message", "Book not found.");
		}
		return result;

	}
}
