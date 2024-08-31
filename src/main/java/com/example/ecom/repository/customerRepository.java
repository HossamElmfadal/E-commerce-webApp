package com.example.ecom.repository;

import com.example.ecom.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerRepository extends JpaRepository<Customer, Integer> {
}
