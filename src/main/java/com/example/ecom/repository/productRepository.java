package com.example.ecom.repository;

import com.example.ecom.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository<Product, Integer> {
}
