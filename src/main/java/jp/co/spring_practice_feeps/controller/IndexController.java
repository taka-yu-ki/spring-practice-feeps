package jp.co.spring_practice_feeps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/index")
	public String index(String name) {
		System.out.println(name);

		return "index";
	}
}
