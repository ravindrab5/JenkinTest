package com.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/test")
	public ResponseEntity<String> getData(){
		return ResponseEntity.status(HttpStatus.CREATED).body("api get call");
	}	
}
