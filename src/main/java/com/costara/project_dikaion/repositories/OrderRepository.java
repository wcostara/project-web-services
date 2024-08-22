package com.costara.project_dikaion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.costara.project_dikaion.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
