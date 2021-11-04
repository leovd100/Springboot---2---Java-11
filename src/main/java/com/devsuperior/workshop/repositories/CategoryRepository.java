package com.devsuperior.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.workshop.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
}
