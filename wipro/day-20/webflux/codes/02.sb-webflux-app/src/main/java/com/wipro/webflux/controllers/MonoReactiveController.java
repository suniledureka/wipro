package com.wipro.webflux.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class MonoReactiveController {
	
	@GetMapping("/mono")
	public Mono<String> handleMonoStream(){
		Mono<String> monoPublisher = Mono.just("Welcome to Wipro Technologies");
		return monoPublisher;
	}
}
