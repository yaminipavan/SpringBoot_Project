package com.example.thymleaf.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.thymleaf.model.Student;
import com.example.thymleaf.model.user;

@Controller
public class studentSelectionExpretionController {

	// Selection Expression
	
	@GetMapping("/selection-Expression")
	public String stuSelectionEx(Model model) {
		Student student = new Student(101, "Pavan", 200.0, "male");
		model.addAttribute("student", student);
		
		return "selectionExpretion";
	}
	
	//Message Expression
	@GetMapping("/message-Expression")
	public String messageExpression() {
		return "mesExp";
	}
	//Link Expression
	
	@GetMapping("/link-Expression")
	public String LinkExpression(Model model) {
		model.addAttribute("id", 1);
		model.addAttribute("name", "pavan");
		return "linkExp";
	}
	
	@GetMapping("/List-expression")
	public String listofUsers(Model model) {
		
		user user = new user("pavan", "pavan@gmail.com", "developer", "male");
		user user1 = new user("pavan", "pavan@gmail.com", "developer", "male");
		user user2 = new user("pavan", "pavan@gmail.com", "developer", "male");
		user user3 = new user("pavan", "pavan@gmail.com", "developer", "male");
		
		List<Object> link = new ArrayList<>();
		
		link.add(user);
		link.add(user1);
		link.add(user2);
		link.add(user3);
		model.addAttribute("user", link);
		return "user";
	}
	
	// exmple of if and unless
	@GetMapping("/if-unless")
	public String ifunless(Model model) {
		user user = new user("shiva", "shiva@gmail.com", "user", "male");
		user user1 = new user("pavan", "pavan@gmail.com", "admin", "male");
		user user2 = new user("kiran", "kiran@gmail.com", "user", "male");
		
		List<Object> link = new ArrayList<>();
		
		link.add(user);
		link.add(user1);
		link.add(user2);
		model.addAttribute("user", link);
		return null;
		
	}
	
	@GetMapping("/switch-user")
	public String switchUser(Model model) {
		user user = new user("Shiva", "shiva@gmail.com", "ADMIN", "male");
		model.addAttribute("user", user);
		return "switch-user";
	}
}
