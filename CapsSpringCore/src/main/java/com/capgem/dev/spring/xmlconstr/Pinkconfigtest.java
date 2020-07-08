package com.capgem.dev.spring.xmlconstr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pinkconfigtest {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("Tigerconfig.xml");
		Tiger t=ctx.getBean(Tiger.class);
		//t.pink.eat();
		System.out.println(t);
		ctx.close();
	}

}
