package com.sunbeam;

public class PersonImpl implements Person {
	private String name;
	private int age;
	
	public PersonImpl() {
	}

	public PersonImpl(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonImpl [name=" + name + ", age=" + age + "]";
	}

	@Override
	public void getName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String setName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getAge(int age) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int setAge() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
