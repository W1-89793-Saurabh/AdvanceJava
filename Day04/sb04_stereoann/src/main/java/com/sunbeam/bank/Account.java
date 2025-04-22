package com.sunbeam.bank;

import com.bank.Logger;

public interface Account {
	void setId(int id);
	int getId();
	void setType(String type);
	String getType();
	void setBalance(double balance);
	double getBalance();
	void setLogger(Logger logger);
	Logger getLogger();
	void deposit(double amount);
	void withdraw(double amount);
}
