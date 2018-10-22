package com.xavier.service.impl;

import com.xavier.service.SchedualServiceHelloworld;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHelloworldImpl implements SchedualServiceHelloworld {
	final String ggMsg = "GG!";

	@Override
	public String sayHiFromClientOne(String name) {
		return ggMsg;
	}

	@Override
	public String sayHaFromClientOne() {
		return ggMsg;
	}
}
