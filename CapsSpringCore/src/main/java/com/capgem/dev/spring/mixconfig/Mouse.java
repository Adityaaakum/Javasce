package com.capgem.dev.spring.mixconfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mouse {
	
	
	private String name="tom";
	private String colour="kalu";

	
	public void eat()
	{
		System.out.println("bhukka");
	}


	@Override
	public String toString() {
		return "Mouse [name=" + name + ", colour=" + colour + "]";
	}
}
