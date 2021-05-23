package com.siyatech.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController 
{
	@GetMapping("/welcome")
	public String getWelcome()
	{
		return "Welcome to Spring-Jenkins Integration";
	}
}
