package com.capgem.dev.spring.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DogMain {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(Dogconfig.class);
		Dog d=ctx.getBean(Dog.class);
		System.out.println(d.hashCode());
		Dog d1=ctx.getBean(Dog.class);
		System.out.println(d1.hashCode());//this is pointing to different object.
		
	//	System.out.println(d);
		d.getJo().dowork();
		ctx.close();
	}

}
