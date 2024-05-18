package com.telusko.Spring.Repository;

import org.springframework.stereotype.Repository;

import com.telusko.Spring.Model.laptop;

@Repository
public class LaptopRepository 
{
	public void save(laptop lap)
	{
		System.out.println("Hey Data saved in the data base " );
		
		
	}
}