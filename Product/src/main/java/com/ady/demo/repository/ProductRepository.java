package com.ady.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ady.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> 
{
	
}
