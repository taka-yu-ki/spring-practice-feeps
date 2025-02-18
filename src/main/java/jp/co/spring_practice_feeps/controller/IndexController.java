package jp.co.spring_practice_feeps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class IndexController {

	@GetMapping("/index")
	public String index(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		if (count == null) {
			count = 1;
		} else {
			count++;
		}
		session.setAttribute("count", count);

		return "index";
	}
}
