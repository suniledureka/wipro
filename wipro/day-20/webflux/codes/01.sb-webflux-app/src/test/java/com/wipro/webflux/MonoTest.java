package com.wipro.webflux;


import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

class MonoTest {
	@Test
	void testMono() {
		Mono<String> monoString = Mono.just("Wipro"); //acting as a publisher
		monoString.subscribe(System.out::println); //to access any publisher, subscriber have to call the subscribe() method of Publisher
	}

	@Test
	void testMono_1() {
		Mono<String> monoString = Mono.just("Wipro").log(); //observe all Reactive Streams signals - to monitor reactive stream workflow
		monoString.subscribe(System.out::println); 
	}	
	
	/*-- throw some error and check the reactive stream workflow*/
	@Test
	void testMono_2() {
		Mono<?> monoString = Mono.just("Wipro").then(Mono.error(new RuntimeException("some error occured"))).log(); 
		monoString.subscribe(System.out::println, ex -> System.err.println(ex.toString()));
	}		
}
