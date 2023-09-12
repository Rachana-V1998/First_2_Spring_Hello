package com.MySimpleProject12._simple.project_12_;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	public class SpringBoot {
	
		@GetMapping("/hello")
		public String hello()
		{
			System.out.println("hello spring boot");
			return "Simple Spring boot project";
			
		}

	}



