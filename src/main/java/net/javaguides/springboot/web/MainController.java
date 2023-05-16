package net.javaguides.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "registrar";
	}
	
	@GetMapping("/")
	public String home() {
		return "registrar";
	}
	@GetMapping("/dashboart")
	public String login() {
		return "registrar";
	}

	@GetMapping("/")
	public String home() {
		return "registrar";
	}
}
