package com.costara.project_dikaion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.costara.project_dikaion.entities.OrderItem;
import com.costara.project_dikaion.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{

}
