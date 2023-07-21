package com.group.ldap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/api")
public class Controller {

	@GetMapping("/sec")
	public String showMessageOfTheDay(){
		return "Hello its: "+ LocalDateTime.now()
				.format(DateTimeFormatter.ofPattern("HH:mm 'on a' EEEE  'the' dd-MM-yyyy"));
	}
}
