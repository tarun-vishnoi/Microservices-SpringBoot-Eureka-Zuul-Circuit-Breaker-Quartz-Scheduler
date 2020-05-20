package com.result;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsResultApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(MsResultApplication.class);

	public static void main(String[] args) {
		LOGGER.info("MsResultApplication :: main()");
		SpringApplication.run(MsResultApplication.class, args);
	}
}
