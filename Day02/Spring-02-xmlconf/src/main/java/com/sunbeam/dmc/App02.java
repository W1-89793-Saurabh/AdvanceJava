package com.sunbeam.dmc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

			
			BoxImpl b1 = (BoxImpl) ctx.getBean("b1");
			int vol1 = b1.calcVolume();
			System.out.println("b1 Volume: " + vol1);
			
			BoxImpl b2 = (BoxImpl) ctx.getBean("b2");
			int vol2 = b2.calcVolume();
			System.out.println("b2 Volume: " + vol2);
		}
	

}
