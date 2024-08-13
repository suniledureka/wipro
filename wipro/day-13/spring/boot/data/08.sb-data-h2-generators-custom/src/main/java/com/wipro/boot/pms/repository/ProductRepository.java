package com.wipro.boot.pms.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.boot.pms.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Serializable> {

}
