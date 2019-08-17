package com.jenkin.org;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTestenkinApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringBootTestenkinApplication.class);
	
	public static void main(String[] args) {
		logger.info("inside main class execution....");
		SpringApplication.run(SpringBootTestenkinApplication.class, args);
	}
	
	@PostConstruct
	public   init()
	{
		logger.info("inside init method execution ");
		logger.debug("testing purpose pipeline");
	}

}
