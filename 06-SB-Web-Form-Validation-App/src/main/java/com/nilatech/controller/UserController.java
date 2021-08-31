package com.nilatech.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nilatech.binding.User;

@Controller
public class UserController {

	@GetMapping("/loadform")
	public String loadForm(Model model) {
		User uobj = new User();
		model.addAttribute("user", uobj);
		return "index";
	}

	@PostMapping("/saveForm")
	public String saveForm(@Valid User user, BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "index";
		}
		System.out.println(user);
		model.addAttribute("msg", "form submited successfully..!!");

		return "dashboard";

	}

}
