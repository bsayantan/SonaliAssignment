package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

	@RestController
	public class controller 
	{
		@RequestMapping("/")
		public ModelAndView LoginPage()
		{
			ModelAndView mv=new ModelAndView();
			mv.setViewName("index.html");
			return mv;
		}

		@RequestMapping("Registration")
		public ModelAndView RegPge()
		{
			ModelAndView mv=new ModelAndView();
			mv.setViewName("reg.html");
			return mv;
		}
		
    }
	
