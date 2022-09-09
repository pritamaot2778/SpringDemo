package com.okta.spring.OktaOAuthClient;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OktaOAuthClientApplication {
	private static final Logger logger = LogManager.getLogger(OktaOAuthClientApplication.class);

	public static void main(String[] args) {
		logger.info("OktaOAuthClientApplication : Start");
		SpringApplication.run(OktaOAuthClientApplication.class, args);
	}

}
