package com.sunbeam;

import java.util.List;

public interface CustomerDao {
	int save(Customers cust);
	int changePassword(int custId, String password);
	Customers findByEmail(String email);
	int update(Customers c);
	int deleteById(int id);
	List<Customers> findAll();
	/* 
	 * 
	 * List<Book> findAll();
	 */

}
