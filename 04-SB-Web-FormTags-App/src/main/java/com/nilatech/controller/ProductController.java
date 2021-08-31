package com.nilatech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nilatech.model.Product;

@Controller
public class ProductController {
	
	@GetMapping("/loadforms")
	private String loadForms(Model model) {
		Product pobj=new Product();
		model.addAttribute("product", pobj);
		
		return "index";
	}
	
	@PostMapping("/saveProduct")
	private String displayProduct(Product product,Model model) {
		
		System.out.println(product);
		model.addAttribute("msg", "Product saved Successfully");
		
		return "dashboard";
	}

}
