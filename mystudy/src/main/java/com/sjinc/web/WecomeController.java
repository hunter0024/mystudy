package com.sjinc.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WecomeController {
	
	
	@GetMapping("/helloworld")
	public String Wecome(String name, int age, Model model) {
		
		System.out.println("name : " + name + "age : " + age);
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		
		return "welcome";
	}
}
