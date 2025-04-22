package com.sunbeam.dmc;
// Create spring bean class "Arithmetic" with fields "num1" and "num2". Write business logic methods "int add()",
//subtract(), multiply(), divide(). Use annotation
//config to create Arithmetic bean "arith" with fixed values e.g. num1=22, num2=7. In main(), 
//access the bean and test all above methods
public class Calculate {
	private int num1;
	private int num2;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public Calculate(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public Calculate() {	
	}
	public float add() {
		return this.num1+this.num2;
	}
	public float sub() {
		return this.num1-this.num2;
	}
	public float multiply() {
		return this.num1*this.num2;
	}
	public float Divide() {
		return this.num1/this.num2;
	}
}
