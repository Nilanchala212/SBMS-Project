package com.nilatech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CarController {

	@GetMapping("/price/{carName}")
	@ResponseBody
	public String getCarDetails(@PathVariable String  carName) {
		String response=carName +" Price is 7.8 Lakhs";
		return response;
		
	}
}
