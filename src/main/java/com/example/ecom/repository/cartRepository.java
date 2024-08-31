package com.example.ecom.repository;

import com.example.ecom.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface cartRepository extends JpaRepository<Cart, Integer> {
}
