package com.async.example.calling.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.async.example.calling.service.controller.svc.ICallingService;

@RestController
public class CallingController {
	
	Logger logger = LoggerFactory.getLogger(CallingController.class);

	@Autowired
	private ICallingService service;
	
	@RequestMapping(value = "/call/{name}")
	public void callExternalService(@PathVariable String name) {
		logger.info("Start Controller - calling external service: {}", name);
		//Async call: executed in a separate thread
		service.callExternalService(name);
		logger.info("End Controller - calling external service: {}", name);

	}
	
}
