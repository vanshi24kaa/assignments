package com.company.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@GetMapping("/")
	public String Hello()
	{
		return("HelloWorld");
	}
	@GetMapping("/user")
	public String User()
	{
		return("welcome user!");
	}
	@GetMapping("/admin")
	public String Admin()
	{
		return("welcome to admin!");
	}
}
