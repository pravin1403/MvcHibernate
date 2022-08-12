package com.BikkadIT.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.BikkadIT.Model.User;

@Controller
public class CrudController {

	@GetMapping("/registration")
	public String preRegistration() {

		return "registration";

	}

	@PostMapping("/reg")
	public String saveUserController(User user) {

		System.out.println(user);
		return "reg";

	}

}
