package com.telusko.app;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.telusko.app.Laptop;
@Service
public class LaptopService {
	
	public void addlaptop(Laptop lap)
	{
		System.out.println("Method callles");
	}

	
	public boolean isgood(Laptop lap)
	{
		return true ;
	}
}
