package com.wipro.webflux.controllers;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class FluxReactiveController {
	
	@GetMapping(path = "/flux")
	public Flux<String> handleFluxStream(){
		Flux<String> fluxPublisher = Flux.just("Java<br>", "Python<br>", "React<br>", "Angular<br>", "JS")
										 .delayElements(Duration.ofSeconds(3))										 
										 .log();
		return fluxPublisher;
	}
	
	@GetMapping(path = "/numbers")
	public Flux<Integer> handleNumbers(){
		Flux<Integer> intPublisher = Flux.range(1, 50)
										 .delayElements(Duration.ofSeconds(1));
		return intPublisher;
	}
	
	@GetMapping(path = "/numbers/square")
	public Flux<?> handleNumberSquare(){
		Flux<?> squarePublisher = Flux.range(1, 10)
									  .delayElements(Duration.ofSeconds(1))
									  .map(data -> Math.pow(data, 2));
		return squarePublisher;
	}
	
	@GetMapping(path = "/numbers/square/string")
	public Flux<String> handleNumberSquareString(){
		Flux<String> squarePublisher = Flux.range(1, 10)
									  .delayElements(Duration.ofSeconds(1))
									  .map(data -> String.format("square of (%d) is %3d<br><br>", data, (int)(Math.pow(data, 2))));
		return squarePublisher;
	}	
}
