package com.wipro.boot.beans.repository;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {

	public OrderRepository() {
		System.out.println("OrderRepository :: Constructor");
	}

}
