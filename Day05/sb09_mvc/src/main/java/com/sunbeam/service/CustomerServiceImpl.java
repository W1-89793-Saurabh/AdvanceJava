package com.sunbeam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.dao.CustomerDao;
import com.sunbeam.entity.Customer;
import com.sunbeam.model.Credentials;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao custDao;
	
	public Customer authenticateCustomer(Credentials cr) {
		// get customer of given email from db
		Customer dbCust = custDao.findByEmail(cr.getEmail());
		// match given password with customer password from db
		if(dbCust != null && cr.getPasswd().equals(dbCust.getPassword()))
			// if matching, successful login;
			return dbCust;
			//else login failed
		else
			return null;
	}
}

