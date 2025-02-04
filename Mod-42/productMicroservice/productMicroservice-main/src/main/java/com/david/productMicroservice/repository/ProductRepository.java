package com.david.productMicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.productMicroservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
