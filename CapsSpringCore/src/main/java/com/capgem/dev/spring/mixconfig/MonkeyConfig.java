package com.capgem.dev.spring.mixconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.capgem.dev.spring.java.Dog;

@Configuration
@Import({cATconfig.class,Dog.class})
@ImportResource("personconfig.xml")
public class MonkeyConfig {
	@Bean("Monkey")
	public Monkey getMonkey()
	{
		
		Monkey m= new Monkey();
		m.setAge(1);
		m.setName("äadi");
		return m;
		
		
	}
	
	

}
