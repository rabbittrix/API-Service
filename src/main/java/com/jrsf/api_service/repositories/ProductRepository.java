package com.jrsf.api_service.repositories;

import com.jrsf.api_service.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
