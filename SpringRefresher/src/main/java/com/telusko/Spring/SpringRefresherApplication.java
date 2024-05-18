package com.telusko.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.Spring.Model.Alien;
import com.telusko.Spring.Model.laptop;
import com.telusko.Spring.Service.Laptopservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRefresherApplication {

	public static void main(String[] args) {
		                 
		
	ApplicationContext context=	SpringApplication.run(SpringRefresherApplication.class, args);
	
//	Alien obj =  context.getBean(Alien.class);
//	
//	obj.code();

	Laptopservice service = context.getBean(Laptopservice.class);
	
	laptop lap = context.getBean(laptop.class);
	
	service.addLaptop(lap);
			
		
		
		System.out.println("Hey welcome to Spring dude");
		
		
	}

}
