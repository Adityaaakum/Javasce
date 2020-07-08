package com.capgem.dev.spring.autowiring;

import javax.inject.Named;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Named("Game")//@Component("Game") both have same functionality but provided by spring and inject api
@Primary
public class Game implements Job {

	@Override
	public void dowork() {
		// TODO Auto-generated method stub
	System.out.println("playing fortnight");	
	}
	
	
	

}
