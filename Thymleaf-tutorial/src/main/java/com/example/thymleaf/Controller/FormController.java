package com.example.thymleaf.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.thymleaf.model.UserForm;

@Controller
public class FormController {

	//Handle method to user reg page request
	@GetMapping("/registor")
	public String Userdetails(Model model) {
		
		UserForm userForm = new UserForm();
		model.addAttribute("userForm", userForm);
		
		List<String> listProfession = Arrays.asList("Developer","Tester","Architect");
		model.addAttribute("listProfession", listProfession);
		return "registration-form";
	}
	
	@PostMapping("register/save")
	public String submitForm(Model model, @ModelAttribute("userForm") UserForm userForm) {
		model.addAttribute("userForm", userForm);
		return "register-success";
		
	}
}
