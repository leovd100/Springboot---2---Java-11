package com.devsuperior.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.workshop.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
}
