package com.jrsf.api_service.repositories;

import com.jrsf.api_service.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
