package com.telusko.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
	
	
	public Desktop()
	{
		System.out.println("Desktop constructor ");
	}
	public void compile()
	{
		System.out.println("Compiling using Desktop");
	}

}
