package com.example.thymleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloworldController {

	@GetMapping("/Hello-world")
	public String hello(Model model) {
		model.addAttribute("message", "Hello World!");
		return "hello";
	}
}
