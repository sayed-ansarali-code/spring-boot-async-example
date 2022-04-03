package com.async.example.calling.service.controller.svc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.async.example.calling.service.client.ExternalServiceClient;

@Service
public class CallingService implements ICallingService{

	Logger logger = LoggerFactory.getLogger(CallingService.class);

	@Autowired
	ExternalServiceClient client;
	
	@Async
	@Override
	public void callExternalService(String name) {
		logger.info("Start Service - calling external service: {}", name);
		client.callMe(name);
		logger.info("End Service - calling external service: {}", name);
	}

}
