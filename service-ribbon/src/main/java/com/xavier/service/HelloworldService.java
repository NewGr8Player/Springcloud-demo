package com.xavier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloworldService {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(path = "/hi", method = {RequestMethod.GET, RequestMethod.POST})
	public String helloworldService(String name) {
		return restTemplate.getForObject("http://SERVICE-HELLOWORLD/hi?name=" + name, String.class);
	}
}
