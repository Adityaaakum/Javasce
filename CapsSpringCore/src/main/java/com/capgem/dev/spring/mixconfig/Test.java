package com.capgem.dev.spring.mixconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgem.dev.spring.java.Dog;
import com.capgem.dev.spring.xml.Person;
import com.capgem.dev.spring.xmlconstr.Tiger;

public class Test {
	public static void main(String[] args) {
		
	/*	AnnotationConfigApplicationContext ss= new AnnotationConfigApplicationContext(MonkeyConfig.class);
	
	       Monkey c=ss.getBean(Monkey.class);
	       
	             Cat cc=ss.getBean(Cat.class);
	             Dog dd=ss.getBean(Dog.class);
	             System.out.println(dd);
	             System.out.println(c);
	             System.out.println(cc);
	             Person p=ss.getBean(Person.class);
	             System.out.println(p);
	       // we have to give only package name to context componenet -scan*/
		ClassPathXmlApplicationContext xx= new ClassPathXmlApplicationContext("Tigerconfig.xml");
		Tiger t=xx.getBean(Tiger.class);
		Cat cc=xx.getBean(Cat.class);
		cc.getM().eat();
		System.out.println(t);
	
	       xx.close();
	} 

}
