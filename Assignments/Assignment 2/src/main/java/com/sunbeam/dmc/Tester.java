package com.sunbeam.dmc;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Tester {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Arithemetic.class);
		Calculate calc=(Calculate)ctx.getBean("C");
		float addition=calc.add();
		float subtraction=calc.sub();
		float multiplication=calc.multiply();
		float divide=calc.Divide();
		System.out.println("Addition is :"+addition);
		System.out.println("Subtraction is :"+subtraction);
		System.out.println("Multiplication is "+multiplication);
		System.out.println("Division is :"+divide);
		

	}

}
