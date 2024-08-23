package com.wipro.gateway;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayserverApplication.class, args);
	}

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
	 return routeLocatorBuilder.routes()
				.route(path_route -> path_route
					     .path("/wiprobank/accounts/**")
					     .filters(f -> f.rewritePath("/wiprobank/accounts/(?<segment>.*)","/${segment}")
					    		 		.addResponseHeader("X-Response-Time", LocalDateTime.now().toString())
					    		 		.circuitBreaker(config -> config.setName("accountsCircuitBreaker")
					    		 										.setFallbackUri("forward:/accounts/contactSupport")))				     
					     .uri("lb://ACCOUNTS")) 

				.route(p -> p.path("/wiprobank/loans/**")
					     	 .filters(f -> f.rewritePath("/wiprobank/loans/(?<segment>.*)","/${segment}")
					     			 		.addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))					  
					     	 .uri("lb://LOANS")) 

				.route(p -> p.path("/wiprobank/cards/**")
					         .filters( f -> f.rewritePath("/wiprobank/cards/(?<segment>.*)","/${segment}")
					        		 		 .addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))					  
					         .uri("lb://CARDS")) 
		        .build();			
	}	
	
}
