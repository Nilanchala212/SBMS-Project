package com.nilatech.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nilatech.binding.Student;
import com.nilatech.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/loadform")
	private String loadForms(Model model) {		
		model.addAttribute("genders", studentService.getGenders());
		model.addAttribute("cources", studentService.getCources());
		model.addAttribute("timings", studentService.getTimings());		
		Student sobj=new Student();
		model.addAttribute("student", sobj);
		
		return "index";
		
	}
	@PostMapping("/saveStudent")
	public String saveStudent(Student student,Model model) {
		
	
		System.out.println(student);
		model.addAttribute("msg", "Regisete Sucessfully...!!");
		
		return "dashboard";
	}

}
