package com.telusko.Spring.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class laptop implements Computer {

	@Autowired
	CPU cpu;
	public void compile()
	{
		System.out.println("Hey LAPTOP");
		cpu.process();
	}
}
