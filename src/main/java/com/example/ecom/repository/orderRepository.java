package com.example.ecom.repository;

import com.example.ecom.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderRepository extends JpaRepository<Order, Integer> {
}
