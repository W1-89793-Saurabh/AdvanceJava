package com.sunbeam.daos;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}