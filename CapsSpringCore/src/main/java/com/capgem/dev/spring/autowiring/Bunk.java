package com.capgem.dev.spring.autowiring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bunk")
@Primary
public class Bunk implements Job {

	@Override
	public void dowork() {
		// TODO Auto-generated method stub
	System.out.println("Bunking the lectures");	
	}
	
	
	

}
