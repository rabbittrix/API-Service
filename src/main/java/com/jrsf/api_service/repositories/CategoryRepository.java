package com.jrsf.api_service.repositories;

import com.jrsf.api_service.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
