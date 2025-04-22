package com.sunbeam;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Spring01App {

	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =  AnnotationConfigApplicationContext(AppConfig.class);
		BoxImpl b1 = (BoxImpl) ctx .getBean("b1");
		int vol1 = b1.calcVolume();
		System.out.println("b1 volume: " + vol1);
		
		BoxImpl b2 = (BoxImpl) ctx .getBean("b2");
		int vol2 = b2.calcVolume();
		System.out.println("b2 volume: " + vol2);
		
	}
}
