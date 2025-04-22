package com.sunbeam.controller;

import java.util.List;
import java.util.Optional;

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

import com.sunbeam.entities.Book;
import com.sunbeam.services.BookServices;

@RequestMapping("/books")
@RestController
public class BookRestController {
	
	@Autowired
	 private BookServices bookServices;
	
	
	
	
	
	@GetMapping("")	
	public ResponseUtil<?> getAllBooks(){
    List<Book> list= bookServices.getAllBooks();
    return ResponseUtil.apiSuccess(list);
	}
	
	@GetMapping("/{id}")	
	public ResponseUtil<?> getBookByid(@PathVariable("id")int id){
	Optional<Book> bk = bookServices.getBookByid(id);		
	return ResponseUtil.apiSuccess(bk);
	}
	
	
	@PostMapping("")
	
	public ResponseUtil<?> addBook(@RequestBody Book b){
		int count = bookServices.addBook(b);
		return ResponseUtil.apiSuccess("Book is added");
	}
	
	
	
	@PutMapping("")	
	public ResponseUtil<?> updateBook(@RequestBody Book b){
		int count = bookServices.updateBook(b);
		return ResponseUtil.apiSuccess("book is updated");
			}
	
	@PatchMapping("/{id}")
		public ResponseUtil<?> updateBookPrice(@PathVariable("id")int id,@RequestBody Book b){
		int count = bookServices.updateBookByprice(b.getPrice(), id);
	    return ResponseUtil.apiSuccess("book price is updated");
			}
	
	@DeleteMapping("/{id}")
	public ResponseUtil<?> deleteMobile(@PathVariable("id") int id){
		int count = bookServices.deleteBookByid(id);
		return ResponseUtil.apiSuccess("Mobile is deleted");
	}
	
	

}
