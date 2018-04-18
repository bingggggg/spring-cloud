package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SERVICE-HI", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
	String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
