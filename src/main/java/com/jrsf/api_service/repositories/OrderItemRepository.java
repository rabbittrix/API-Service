package com.jrsf.api_service.repositories;

import com.jrsf.api_service.entities.OrderItem;
import com.jrsf.api_service.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
