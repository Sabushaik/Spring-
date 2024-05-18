package com.telusko.Spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.Spring.Model.Shikari;
import com.telusko.Spring.Repository.ShikariRepo;

@Service 
public class ShikariService 
{
	
	private ShikariRepo repo;
	
	
	public ShikariRepo getRepo() {
		return repo;
	}

    @Autowired
	public void setRepo(ShikariRepo repo) {
		this.repo = repo;
	}


	public void addedshikari(Shikari shikari)
	{
		
		repo.save(shikari);
		System.out.print("Hey added");
	}

	public List<Shikari> getShikaris() {
		// TODO Auto-generated method stub
		return repo.findall();
	}
}