package com.xavier.api;

import com.xavier.service.SchedualServiceHelloworld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

	@Autowired
	SchedualServiceHelloworld schedualServiceHelloworld;

	@GetMapping(value = "/hi")
	public String sayHi(@RequestParam String name) {
		return schedualServiceHelloworld.sayHiFromClientOne(name);
	}

	@GetMapping(value = "/ha")
	public String sayHa() {
		return schedualServiceHelloworld.sayHaFromClientOne();
	}
}
