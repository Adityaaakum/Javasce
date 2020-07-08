package com.capgem.dev.spring.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class Dogconfig {
//	@Scope("prototype")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	@Bean("haha")
	public Dog getDog( @Qualifier("bark") Job j)//in java @autowiring is not mandatory
	{
		Dog d= new Dog();
		d.setAge(2);
		d.setBreed("kuta");
		d.setName("Gabbar");
		d.setJo(j);
		return d;
	}
	@Primary
		@Bean("bark")
	public Bark dobark()
	{
		Bark b= new Bark();
		return b;
	}
		@Primary
	@Bean("Biting")
	public Biting getBiting()
	{
		Biting b= new Biting();
		return b;
		
	}
	@Primary
	@Bean("sleep")
	public Sleep dosleep()
	{
		Sleep s= new Sleep();
		return s;
	}
	

}
