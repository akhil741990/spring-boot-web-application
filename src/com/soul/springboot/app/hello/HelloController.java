package com.soul.springboot.app.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/who-am-i")
	public String helloWorld() {
		return "अहं ब्रह्मास्मीति";
	}
}
