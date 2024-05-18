package com.telusko.SpringRefresher2.Appconfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.telusko.SpringRefresher2.Alien;
import com.telusko.SpringRefresher2.Computer;
import com.telusko.SpringRefresher2.Desktop;
import com.telusko.SpringRefresher2.Laptop;

@Configuration
@ComponentScan("com.telusko.SpringRefresher2")
public class Appconfig
{ 
//	@Bean
//	//@Scope("prototype")
//	public Desktop desktop()
//	{
//		return new Desktop();
//	}
//	@Bean
//	public Alien alien(Computer comp ) // @Qualifier("desktop")
//	{
//		Alien obj = new Alien();
//		obj.setAge(25);
//		obj.setComp(comp);
//		return obj;
//		
//	}
//	@Bean
//	@Primary
//	public Laptop lap()
//	{
//		return new  Laptop();
//	}
//	
	
	
}