package com.devsuperior.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.workshop.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
}
