package com.telusko.JobApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.telusko.JobApp.model.*;
import com.telusko.JobApp.service.JobService;

@Controller
public class JobController {
	
	@Autowired
	private JobService service;
	
	@GetMapping({"/","home"})
	public String home()
	{
		return "home" ;
	}
	
	@GetMapping("addjob")
	public String addjob()
	{
		return "addjob";
	}
	
	@PostMapping("handleForm")
	public String handleform(JobPost jobPost)
	{
		
		service.addJobPost(jobPost);
		
		return "success";
	}
	
	@GetMapping("viewalljobs")
	public String viewalljobs(Model m)
	{
		List<JobPost> jobs=service.returnAllJobPosts();
		m.addAttribute("jobPosts",jobs);
		return "viewalljobs";
	}

	
	
}
