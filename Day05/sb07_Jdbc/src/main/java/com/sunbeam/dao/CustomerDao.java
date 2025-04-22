package com.sunbeam.dao;

import com.sunbeam.entity.Customer;

public interface CustomerDao {
	int save(Customer cust);
	int changePassword(int custId, String password);
	Customer findByEmail(String email);
}
