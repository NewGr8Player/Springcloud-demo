package com.xavier.api;

import com.xavier.service.HelloworldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControler {

	@Autowired
	private HelloworldService helloworldService;

	@GetMapping(value = "/hi")
	public String hi(@RequestParam String name) {
		return helloworldService.helloworldService(name);
	}
}
