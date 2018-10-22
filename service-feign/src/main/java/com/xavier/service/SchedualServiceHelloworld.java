package com.xavier.service;

import com.xavier.service.impl.SchedualServiceHelloworldImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-helloworld",fallback = SchedualServiceHelloworldImpl.class)
public interface SchedualServiceHelloworld {

	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name") String name);

	@RequestMapping(value = "/ha",method = RequestMethod.GET)
	String sayHaFromClientOne();
}
