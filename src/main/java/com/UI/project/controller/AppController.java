package com.UI.project.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AppController {
	
	@GetMapping("/")
	public ModelAndView getWelcome(){
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@GetMapping("/admin")
	public ModelAndView getAdmin(){
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("welcomeadmin");
	    return modelAndView;
	}
	
	@GetMapping("/user")
	public ModelAndView getUser(){
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("welcomeuser");
	    return modelAndView;
	}
	
	@GetMapping("/try")
	public ModelAndView getTry(){
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("login");
	    return modelAndView;
	}
	
}
