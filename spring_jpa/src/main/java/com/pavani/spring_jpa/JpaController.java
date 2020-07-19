package com.pavani.spring_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JpaController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/home")
	public String home()
	{
		
		return "home.jsp";
		
	}
	@RequestMapping("/addAlien")
	public String addAlien(Alien1 alien) {
		repo.save(alien);
		return "home.jsp";
		
	}

}
