package com.capgem.dev.spring.autowiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Studenttest {
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(Studentconfig.class);
		Student s=ctx.getBean(Student.class);
		s.getJ().dowork();
	
		ctx.close();
	}

}
