package com.example.demo.Repository;

import com.example.demo.Entity.OrderItemEntity;
import com.example.demo.Entity.PK.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItemEntity, OrderItemPK> {
}
