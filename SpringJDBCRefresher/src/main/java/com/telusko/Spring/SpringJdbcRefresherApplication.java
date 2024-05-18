package com.telusko.Spring;


import org.springframework.context.ApplicationContext;

import com.telusko.Spring.Model.Shikari;
import com.telusko.Spring.Service.ShikariService;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringJdbcRefresherApplication {

	public static void main(String[] args) {
		 ApplicationContext context=SpringApplication.run(SpringJdbcRefresherApplication.class, args);
		
		System.out.println("Hey");
		
		Shikari shikari = context.getBean(Shikari.class);
		
		shikari.setAge(25);
		shikari.setName("prakash");
		shikari.setPackage(56888);
		shikari.setPhonenumber(917675800612l);
		
	ShikariService set = context.getBean(ShikariService.class);
	
	set.addedshikari(shikari);
	
	List <Shikari> shikaris = set.getShikaris();
	
	System.out.println(shikaris);
	
		//System.out.println(shikari.toString());
		
		
		
	}

}
