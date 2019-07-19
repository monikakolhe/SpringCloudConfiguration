package com.kunal.config.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.kunal.config.*")
public class ConfigClientRestApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ConfigClientRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientRestApplication.class, args);
	}

	@Bean
	public CommandLineRunner printProperties(@Value("${message}") final String fooProperty) {
		return args -> LOGGER.info("message value: [{}]", fooProperty);
	}
}
