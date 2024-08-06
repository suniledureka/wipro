package com.wipro.spring.core.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class User {
  public User() {
	  System.out.println("no arguments constructor");
  }
}
