package com.sunbeam.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunbeam.dao.BookDao;
import com.sunbeam.entity.Book;

@Controller
public class BookController {
	
	@Autowired
	private BookDao bookDao;
	
	
	@PostMapping("/showbooks")
	public String showSubjectBooks(@RequestParam("subjects") String subject, Model model) {
		
		List<Book> list = bookDao.findBySubject(subject);
		model.addAttribute("bookList", list); // add list data into request.
		return "books"; // viewname --> /books.jsp
	}
	
	@GetMapping("/allbooks")
	public @ResponseBody List<Book> getAllBooks() {
		List<Book> list = bookDao.findAll();
		return list;
	}
}
