package com.telusko.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class laptop implements Computer {
	
	
	
	public void compile()
	{
		System.out.println("Compiling using laptop");
	}
}
