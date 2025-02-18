package jp.co.spring_practice_feeps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/index")
	public String index(String keyword, Model model) {
		if (keyword == null || keyword.length() == 0) {
			model.addAttribute("errorMessage", "検索キーワードを入力してください");
		} else {
			model.addAttribute("message", "入力された検索キーワードは「" + keyword + "」です");
		}

		return "index";
	}
}
