package com.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Member;
import com.example.repository.MemberRepository;

@Controller
@RequestMapping("/exam05")
public class Exam05Controller {
	
	@Autowired
	private MemberRepository repo;
	
	@RequestMapping("")
	public String index() {
		return "/exam-05/exam05";
	}
	
	@RequestMapping("/result")
	public String toResult(String name, Model model) {
		
		
		List<Member> meberList = repo.find(name);
		model.addAttribute("memberList",meberList);
		
		
		return "/exam-05/exam05-result";
	}
	
}
