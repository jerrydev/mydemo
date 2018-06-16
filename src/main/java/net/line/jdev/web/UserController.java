package net.line.jdev.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	private List<User> users = new ArrayList<User>();
	
	@PostMapping("/create")
	public String create(User user) {
//	public String create(String userId, String password, String name, String email) {
//		System.out.println("userId:" + userId + " name:" +name);
		System.out.println("user : " + user);
		users.add(user);
//		return "index";
		return "redirect:/list";	//list화면으로 이동
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("users", users);
		return "list";
	}
	
}
