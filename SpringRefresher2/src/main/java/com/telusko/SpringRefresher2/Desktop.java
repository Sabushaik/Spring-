package com.telusko.SpringRefresher2;

import org.springframework.stereotype.Component;

@Component("sabu")
public class Desktop implements Computer {
	
	public void compile()
	{
		System.out.println("Compiling in the desktop");
	}

}
