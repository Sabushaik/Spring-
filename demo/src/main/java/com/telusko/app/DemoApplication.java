package com.telusko.app;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		
	ApplicationContext con=SpringApplication.run(DemoApplication.class, args);
		
		//System.out.println("Hello sabu welcome to the Spring boot");
		
		LaptopService service = con.getBean(LaptopService.class);
		
		Laptop lap = con.getBean(Laptop.class);
		
		service.addlaptop(lap);
		
		
	}

}
