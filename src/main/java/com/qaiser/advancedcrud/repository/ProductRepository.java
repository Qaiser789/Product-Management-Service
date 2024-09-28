package com.qaiser.advancedcrud.repository;

import com.qaiser.advancedcrud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
