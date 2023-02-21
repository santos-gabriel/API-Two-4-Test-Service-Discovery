package br.com.apione.two.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloWorldTwo {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<String> findAll() {
		return ResponseEntity.ok().body("Hello world!");
	}
	
}
