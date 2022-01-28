package com.microservices.gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@RequestMapping(value = "userServiceFallBack")
	public String userServiceFallBackMethod() {
		return "User Service failed";
	}

	@RequestMapping(value = "departmentServiceFallBack")
	public String departmentServiceFallBackMethod() {
		return "department Service failed";
	}
}
