package com.telusko.SpringProject;

//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//
//
//
//
//	@Controller
//	public class HomeController {
//		
//		@RequestMapping("/")
//		public String home() {
//			System.out.println("Home method called");
//			return "index";
//		}
////		@RequestMapping("addAlien")
////		public String addAlien(Alien alien)
////		{
////			return "Result";
////		}   //here we are using the only one annotation called @ModelAttribute ;
////		//There is no need of model attribute because we get it default 
////		@ModelAttribute("course")
////		public String coursename()
////		{
////			return "java is best ";
////		}
//		
//		
//		
//		
////		@RequestMapping("add")
////		public String add(HttpServletRequest req ,HttpSession session)
////		{
////			int num1 = Integer.parseInt(req.getParameter("num1"));
////			int num2= Integer.parseInt(req.getParameter("num2"));
////			
////			int result = num1+num2 ;
////			System.out.println(result);
////			session.setAttribute("result", result);
////			return "Result.jsp";
////		}   Servlet way of approach 
//		
//		
////		@RequestMapping("add")
////		public String add(int num1 , int num2 ,HttpSession session)
////		{
////			
////			
////			int result = num1+num2+6 ;
////			
////			session.setAttribute("result", result);
////			return "Result.jsp";
////		}   this is by passing it actual names 
//		
//
////		@RequestMapping("add")
////		public String add(@RequestParam("num1")int num , int num2 ,HttpSession session)
////		{
////			
////			
////			int result = num+num2+6 ;
////			
////			session.setAttribute("result", result);
////			return "Result.jsp";
////		}  
//		//this is done by using the annotation called Requestparameter 
//		@RequestMapping("add")
//		public ModelAndView add(@RequestParam("num1")int num ,@RequestParam("name") int num2 ,ModelAndView  model)
//		{
//			
//			
//			int result = num+6 ;
//			
//			model.addObject("result", result);
//			model.setViewName("Result");
//			return model;
//		}  
//		
//		@RequestMapping("addAlien")
//		public String addAlien(int id , String name ,ModelAndView  model)
//		{
//			Alien alien = new Alien();
//			
//		alien.setId(id);
//		alien.setName(name);
//			model.addObject("alien", alien);
//			model.setViewName("Result");
//			return "Result";
//		}   // Here we are using to pass the parameters into one by one 
//
//		
//		
		
//	}
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	@ModelAttribute("course")
	public String courseName() {
		return "Java";
	}
	
	
	
	
	@RequestMapping("/")
	public String home() {
		// System.out.println("Home method called");
		return "index";
	}

	
	
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) {

		int result = num1 + num2;
		mv.addObject("result",result);
		mv.setViewName("result");

		return mv;
	}
	
	
	

//	@RequestMapping("addAlien")
//	public ModelAndView addAlien(@ModelAttribute Alien alien , ModelAndView mv) {
//	//public String addAlien(@ModelAttribute("alien1") Alien alien) {
//       
//		mv.addObject("alien",alien);
//		mv.setViewName("Result");
//		return mv ;
//	}
	
	@RequestMapping("addAlien")
	public ModelAndView addAlien(@RequestParam("aid")int aid , @RequestParam("aname")String aname ,ModelAndView  model)
	{
		Alien alien = new Alien();
		alien.setAname(aname);
		alien.setAid(aid);
	
		model.addObject("alien", alien);
		model.setViewName("Result");
		return model;
	}
	

}

