/**
 * 
 */
package com.kunal.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rohit
 *
 */
@RestController
@RefreshScope
public class ClientController {

	@Value("${message}")
	private String message;

	@RequestMapping(value = "/read/property")
	ResponseEntity<String> readPropertyValue() {
		return new ResponseEntity<>(message, HttpStatus.OK);

	}

}
