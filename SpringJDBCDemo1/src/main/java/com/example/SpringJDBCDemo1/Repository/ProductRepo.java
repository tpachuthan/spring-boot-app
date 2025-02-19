package com.example.SpringJDBCDemo1.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringJDBCDemo1.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {
    // For fetching all products with pagination
    Page<Product> findAll(Pageable pageable);
    
    // Custom method to search by name
    @Query("SELECT p FROM Product p WHERE p.name LIKE %?1%")
    Page<Product> findByNameContaining(String name, Pageable pageable);
