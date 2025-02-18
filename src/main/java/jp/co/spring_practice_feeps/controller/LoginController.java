package jp.co.spring_practice_feeps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String doLogin(String userId, String password) {
		if (userId != null && userId.length() > 0 && userId.equals(password)) {
			return "redirect:/top";
		} else {
			return "login";
		}
	}

	@GetMapping("/top")
	public String top() {
		return "top";
	}

}