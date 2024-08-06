package com.wipro.spring.core.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class User1 {
  public User1() {
	  System.out.println("no arguments constructor of User1");
  }
}
