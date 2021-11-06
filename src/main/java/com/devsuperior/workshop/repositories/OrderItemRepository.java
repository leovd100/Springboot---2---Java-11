package com.devsuperior.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.workshop.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}
