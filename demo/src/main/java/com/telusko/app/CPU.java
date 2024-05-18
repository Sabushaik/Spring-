package com.telusko.app;

import org.springframework.stereotype.Component;

@Component
public class CPU implements Computer  {

	public void compile()
	{
		System.out.println("Printing in the Cpu file");
	}
}
