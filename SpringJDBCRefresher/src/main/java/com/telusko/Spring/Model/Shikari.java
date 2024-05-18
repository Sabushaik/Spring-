package com.telusko.Spring.Model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Shikari
{
	private String Name ;
	private int Age ;
	private long  Phonenumber  ;
	
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public long getPhonenumber() {
		return Phonenumber;
	}


	public void setPhonenumber(long phonenumber) {
		Phonenumber = phonenumber;
	}


	public int getPackage() {
		return Package;
	}


	public void setPackage(int package1) {
		Package = package1;
	}


	private int Package ;

	
	@Override
	public String toString() {
		return "Shikari [Name=" + Name + ", Age=" + Age + ", Phonenumber=" + Phonenumber + ", Package=" + Package + "]";
	}
	
	
	
}
