package com.capgem.dev.spring.autowiring;

import javax.inject.Inject;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("student")
public class Student implements BeanNameAware {
	private int age=22;
	private String name="aditya";
	
	
	
	
	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Job getJ() {
		return j;
	}




	public void setJ(Job j) {
		this.j = j;
	}
	
	
	public void setBeanName(String s)// it will give bean class name as bean name when we dont give a name in @componenet
	{
		System.out.println("Bean name is"+s);
		
	}



//will  give a anull pointer exception as qualifier wants is not present actually it would have given noeligible exception but as we used required=false in autowired we got npe
	@Autowired(required=false) //also we can us e@autowired
	@Qualifier("Game")
	private Job j;
	

}
