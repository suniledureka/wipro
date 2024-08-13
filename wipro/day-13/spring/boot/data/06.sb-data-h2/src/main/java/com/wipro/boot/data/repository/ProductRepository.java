package com.wipro.boot.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.boot.data.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
