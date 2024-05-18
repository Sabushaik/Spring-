package com.telusko.Spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.Spring.Model.laptop;
import com.telusko.Spring.Repository.LaptopRepository;

@Service
public class Laptopservice {
	
	@Autowired
	private LaptopRepository repo ;
	public void addLaptop(laptop lap)
	{
		System.out.println("Hey Laptop service is enabled");
		repo.save(lap);
	}
	
}