package jp.co.spring_practice_feeps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("message", "処理が完了しました");
		model.addAttribute("messageClass", "information");

		return "index";
	}
}
