package com.example.ecom.repository;

import com.example.ecom.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface adminRepository extends JpaRepository<Admin, Integer> {
}
