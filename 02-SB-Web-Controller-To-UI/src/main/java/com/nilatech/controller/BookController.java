package com.nilatech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
	
	@GetMapping("/bookdata")
	public String getBookData(Model model) {
		
		model.addAttribute("name", "Spring Boot");
		model.addAttribute("author", "Nilanchala");
		model.addAttribute("price", 2500);
		
		return "book-data";
		
		
	}

}
