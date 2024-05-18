package com.telusko.SpringRefresher2;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
 
	// by default we can use the class name in smaller letters  or we can use name @Component("name");
	private Computer comp;
	public Alien()
	{
		//System.out.println("this is Alien Object");
	}
	@Value("27")
	private int age ;
	
	
	
	public Computer getComp() {
		return comp;
	}

	@Autowired
	@Qualifier("sabu") 

	public void setComp(Computer comp) {
		this.comp = comp;
	}
	
	//@ConstructorProperties( { "age ","lap1" })
//	public Alien(int age , Laptop lap)
//	{
//		this.age=age;
//		this.lap=lap;
//		System.out.println("Para constructor called");
//	}
	
	


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		
		//System.out.println(" Setter is called");
		this.age = age;
	}


	public void code()
	{ 
		comp.compile();
		System.out.println("Coding here");
		//System.out.println("Hey sabu this is coding should be done");
	}
}
