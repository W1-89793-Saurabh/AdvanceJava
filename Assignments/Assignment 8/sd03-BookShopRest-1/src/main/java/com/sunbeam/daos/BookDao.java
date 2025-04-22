package com.sunbeam.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.sunbeam.entities.Book;

public interface BookDao extends JpaRepository<Book, Integer> {
	
	
	@Modifying
	@Query(value="Update Book set price=?1 where id=?2")
	
	int updateBookPriceById(double price, int id);	

}
