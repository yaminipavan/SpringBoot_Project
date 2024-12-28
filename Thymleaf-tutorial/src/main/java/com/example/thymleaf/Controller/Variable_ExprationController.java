package com.example.thymleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.thymleaf.model.user;

@Controller
public class Variable_ExprationController {

	@GetMapping("/VarExp")
	public String addUser(Model model) {
		user user = new user("pavan", "pavan@gmail.com", "developer", "male");
		model.addAttribute("user", user);
		
		return "variableExpretion";
	}

}
