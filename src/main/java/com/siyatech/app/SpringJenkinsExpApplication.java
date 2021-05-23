package com.siyatech.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsExpApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsExpApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsExpApplication.class, args);
		logger.info("**************Application started successfully**********************");
	}

}
