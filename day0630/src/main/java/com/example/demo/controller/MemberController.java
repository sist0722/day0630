package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MemberController {
	
	@GetMapping("/login")
	@ResponseBody
	public String login() {
		return "로그인";
	}
	
	@RequestMapping("/loginOK")
	public String loginOK() {
		return "redirect:/listBoard";
	}
}
