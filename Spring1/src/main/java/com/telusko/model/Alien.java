package com.telusko.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	@Autowired
	@Qualifier("desktop")
	private Computer com;
	
	@Value("21")
	private int age ;
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		
		//System.out.println("Setter called");
		this.age = age;
	}



	public Alien()
	{
		//System.out.println("Alien Object Created");
	}

	
	public Alien(int age ,Computer  com)
	{
		this.age=age;
		this.com=com;
		
		//System.out.println("Here Para constructor called");
	}


		public void code ()
		{
			//System.out.println("HEy man code");
			com.compile();
			
			
		}



		public Computer getCom() {
			return com;
		}



		public void setCom(Computer com) {
			this.com = com;
		}



		


}
