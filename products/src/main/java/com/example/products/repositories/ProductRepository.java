package com.example.products.repositories;

import com.example.products.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProductRepository extends JpaRepository<Product,Long> {
}
