package com.capgem.dev.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Personmain {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext con= new ClassPathXmlApplicationContext("personconfig.xml");
		    Person p=con.getBean(Person.class);
		    Person p1=con.getBean(Person.class);
		    System.out.println(p.getName());
		    System.out.println(p.getId());
		   System.out.println(p.getAge());
		  System.out.println( p.getJob());
		    System.out.println(p.hashCode());
		    System.out.println(p1.hashCode());//prototype
		    
		   con.close();
		
		
	}

}
