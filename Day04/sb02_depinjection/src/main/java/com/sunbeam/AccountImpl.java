package com.sunbeam;

public class AccountImpl implements Account {
	private int id;
	private String type;
	private double balance;
	private Person accHolder;

	public AccountImpl() {
		
	}

	public AccountImpl(int id, String type, double balance, Person accHolder) {
		super();
		this.id = id;
		this.type = type;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	@Override
	public String toString() {
		return "AccountImpl [id=" + id + ", type=" + type + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}

	@Override
	public void deposit(double amount) {
		this.balance = this.balance + amount;
		
	}

	@Override
	public void withdraw(double amount) {
		this.balance = this.balance - amount;
		
	}
	
	

}
