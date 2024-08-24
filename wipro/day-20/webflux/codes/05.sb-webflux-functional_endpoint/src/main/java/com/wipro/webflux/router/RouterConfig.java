package com.wipro.webflux.router;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.wipro.webflux.service.CustomerHandler;

@Configuration
public class RouterConfig {
    @Autowired
    private CustomerHandler handler;
    
    @Bean
    public RouterFunction<ServerResponse> routerFunction(){
        return RouterFunctions.route()
                				.GET("/router/customers/all", handler::loadCustomers)    
                				.GET("/router/customers/all/stream", handler::loadCustomersAsStream)  
                				.GET("/router/customer/{customerId}", handler::findCustomer)
                				.build();
    }
}
