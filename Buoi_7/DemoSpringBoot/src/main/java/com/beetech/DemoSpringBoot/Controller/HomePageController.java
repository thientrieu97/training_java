package com.beetech.DemoSpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
	
	@GetMapping("/quickstart")
	public String quickstart() {
		return "Hello";
	}
	
}
