package com.async.example.called.service.controller;

import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalledController {
	
	Logger logger = LoggerFactory.getLogger(CalledController.class);

	@RequestMapping(value = "/callme/{name}", method = RequestMethod.GET)
	public void callMe(@PathVariable String name) {
		logger.info("Start of callMe: {}", name);

		IntStream.rangeClosed(1, 4).forEach(num -> {
			try {
				logger.info("Service called: {} - {}", num, name);
				Thread.sleep(1000l);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});	
		
		logger.info("End of callMe: {}", name);
	}
	
}
