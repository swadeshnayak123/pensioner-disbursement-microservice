package com.pensionerDisbursementMicroservice.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient(name="auth-service",url = "http://13.235.87.33:8081/auth")
public interface AuthorizationServiceClient {
	
	@PostMapping(value = "/authorize")
	public boolean authorizeRequest(@RequestHeader(value = "Authorization",required = true) String header);
	
}
