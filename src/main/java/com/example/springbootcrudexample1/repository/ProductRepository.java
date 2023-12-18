package com.example.springbootcrudexample1.repository;


import com.example.springbootcrudexample1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}

