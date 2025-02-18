package jp.co.spring_practice_feeps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.spring_practice_feeps.entity.TrainingUser;
import jp.co.spring_practice_feeps.repository.TrainingUserRepository;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	private TrainingUserRepository userRepository;

	@GetMapping("/index")
	public String index(Model model, Pageable pageable) {
		// ユーザ情報の検索
		Page<TrainingUser> pageList = userRepository.findAll(pageable);

		// 検索結果を格納
		List<TrainingUser> userList = pageList.getContent();

		// リクエストスコープに保存
		model.addAttribute("pages", pageList);
		model.addAttribute("users", userList);

		return "users/index";
	}
}
