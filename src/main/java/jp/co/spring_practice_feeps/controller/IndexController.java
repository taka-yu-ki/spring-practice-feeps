package jp.co.spring_practice_feeps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/index")
	public String index() {
		return "employee/index";
	}

	@GetMapping("/new")
	public String newIndex() {
		return "employee/new";
	}
}