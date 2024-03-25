package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // indica o controller
@RequestMapping("/helloworld") //
public class HelloWorldController {

	@GetMapping() //requisições do tipo Get/busca
	public String hello() {
		return "Hello World <br> Trabalho em Equipe <br>";
	}

	
	
	
}
