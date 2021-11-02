package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	
	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "/exam03/exam03";
	}
	
	@RequestMapping("/result")
	public String toResult(Integer num1, Integer num2, Integer num3) {
		int taxIncluded = num1 + num2 + num3;
		application.setAttribute("taxIncluded", taxIncluded);
		int taxExcluded = (int)(taxIncluded * 1.1);
		System.out.println(taxExcluded);
		application.setAttribute("taxExcluded", taxExcluded);
		return "/exam03/exam03-result";
	}
}
