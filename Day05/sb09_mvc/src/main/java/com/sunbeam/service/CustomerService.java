package com.sunbeam.service;

import com.sunbeam.entity.Customer;
import com.sunbeam.model.Credentials;

public interface CustomerService {
	Customer authenticateCustomer(Credentials cr);
}
