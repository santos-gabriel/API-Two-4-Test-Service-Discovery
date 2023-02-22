package br.com.apione.two.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/apitwo")
public class HelloWorldTwo {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<String> findAll() {
		return ResponseEntity.ok().body("Hello world two!");
	}
	
	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
	public ResponseEntity<String> findAll2() {
		String res = restTemplate.getForObject("http://apione-service/hello/", String.class);
		return ResponseEntity.ok().body(res);
		
	}
	
}

