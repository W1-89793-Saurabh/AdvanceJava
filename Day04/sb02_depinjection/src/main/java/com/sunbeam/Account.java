package com.sunbeam;

public interface Account {
	void setId(int id);
	int getId();
	void setType(String type);
	String getType();
	void setBalance(double balance);
	double getBalance();
	void setAccHolder(Person accHolder);
	Person getAccHolder();
	void deposit(double amount);
	void withdraw(double amount);
}
