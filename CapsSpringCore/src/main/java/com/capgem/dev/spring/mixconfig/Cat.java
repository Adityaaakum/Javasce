package com.capgem.dev.spring.mixconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Cat {
	
	
	
	private String name="java";
	private String colour="satrangi";
	public void ggmu()
	{
		System.out.println("glory glory man united");
		
	}
	@Autowired
	private Mouse m;
	@Override
	public String toString() {
		return "Cat [name=" + name + ", colour=" + colour + ", m=" + m + "]";
	}
	public Mouse getM() {
		return m;
	}
	public void setM(Mouse m) {
		this.m = m;
	}
	

}
