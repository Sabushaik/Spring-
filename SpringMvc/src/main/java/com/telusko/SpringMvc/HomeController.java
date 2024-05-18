package com.telusko.SpringMvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller

public class HomeController 
{
	
	@ModelAttribute("course")
	public String coursename()
	{
		return "Kerala";
	}
	@RequestMapping("/")
	public String home()
	{
		System.out.println("Home method called");
		return "index";
	}
	
	@RequestMapping("/add")
	
	public ModelAndView add( @RequestParam("num1")int num1 , int num2 ,ModelAndView mv ) // Model used  // we can use HttpSession object 
	{
		
		int res =num1+num2;
		mv.addObject("result",res);
		
		mv.setViewName("result");
		return mv;
	}
	
@RequestMapping("/Alien")
	
	public String Alien( Alien alien) // Model used  // we can use HttpSession object 
	{
		
//		Alien alien = new Alien();
//		alien.setAid(aid);
//		alien.setAname(aname);
//		mv.addObject("alien",alien);
//		
//		mv.setViewName("result");
//		return mv;
	return "result";
	
	}
}