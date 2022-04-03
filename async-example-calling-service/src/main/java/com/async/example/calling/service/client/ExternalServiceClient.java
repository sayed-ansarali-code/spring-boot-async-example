package com.async.example.calling.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "called-service", url = "http://localhost:8081")
public interface ExternalServiceClient {
	
	@RequestMapping(value = "/callme/{name}", method = RequestMethod.GET)
	public void callMe(@PathVariable String name);

}
