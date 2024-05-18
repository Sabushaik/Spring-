package com.telusko.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import AppConfiguration.Appconfig;
public class App {

	public static void main(String args[])
	{
		
		ApplicationContext context= new AnnotationConfigApplicationContext(Appconfig.class);
		
		
	
		
       Desktop obj1 =context.getBean(Desktop.class);
        
       Desktop obj2 =context.getBean(Desktop.class);
       
       obj2.compile();
       
       

obj1.compile();


Alien obj = context.getBean(Alien.class);
System.out.println(obj.getAge());
obj.code();

		
		
	
		}
}
