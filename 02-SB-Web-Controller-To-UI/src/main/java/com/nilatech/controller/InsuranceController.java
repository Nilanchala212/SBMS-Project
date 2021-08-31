package com.nilatech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nilatech.domain.Plan;

@Controller
public class InsuranceController {
	
	@GetMapping("/plandetails")
	@ResponseBody
	public Plan insuranceDetails() {
		
		Plan p=new Plan();
		
		p.setPlanId(121);
		p.setPlanName("Jeevan Anand");
		p.setPlanStatus("Active");
		
		return p;
		
	}

}
