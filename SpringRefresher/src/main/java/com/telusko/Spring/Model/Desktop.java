package com.telusko.Spring.Model;

import org.springframework.stereotype.Component;

@Component("sabu")
public class Desktop implements Computer
{
	
	public void compile()
	{
		System.out.println("Hey compiling in Desktop");
	}
}