package com.wipro.webflux;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

class FluxTest {
	@Test
	void testFlux() {
		Flux<String> fluxString = Flux.just("Java", "Python", "React", "Angular", "JS"); //acting as my Publisher
		//fluxString.subscribe(data -> System.out.println(data)); //start emitting 5 events
		fluxString.subscribe(System.out::println);
	}

	@Test
	void testFlux_01() {
		Flux<String> fluxString = Flux.just("Java", "Python", "React", "Angular", "JS").log(); //to check reactive stream workflow 
		fluxString.subscribe(data -> System.out.println(data)); 
	}
	
	@Test
	void testFlux_02() {
		Flux<String> fluxString = Flux.just("Java", "Python", "React", "Angular", "JS")
									  .concatWithValues("HTML") //to add some additional data
									  .log();
		fluxString.subscribe(data -> System.out.println(data)); 
	}	
	
	@Test
	void testFlux_03() {
		Flux<String> fluxString = Flux.just("Java", "Python", "React", "Angular", "JS")
									  .concatWithValues("HTML")
									  .concatWith(Flux.error(new RuntimeException("some error occured in Flux")))
									  .log();
		fluxString.subscribe(data -> System.out.println(data)); 
	}
	
	@Test
	void testFlux_04() {
		Flux<String> fluxString = Flux.just("Java", "Python", "React", "Angular", "JS")
									  .concatWithValues("HTML")
									  .concatWith(Flux.error(new RuntimeException("some error occured in Flux")))
									  .concatWithValues("CSS")
									  .log();
		fluxString.subscribe(System.out::println, e -> System.err.println(e)); 
	}	

	
	@Test
	void testFlux_05() {
		Flux<String> fluxString = Flux.just("Java", "Python", "React", "Angular", "JS")
									  .delayElements(Duration.ofSeconds(1));		
		fluxString.subscribe(data -> System.out.println(data));
	}	
}
