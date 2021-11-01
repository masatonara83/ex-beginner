package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01")
public class Exam01Controller {

	@RequestMapping("")
	public String index() {
		return "/exam-01/exam01";
	}
	
	@RequestMapping("/result")
	public String toResult(String name, Model model) {
		model.addAttribute("name", name);
		
		return "/exam-01/exam01-result";
	}
}
