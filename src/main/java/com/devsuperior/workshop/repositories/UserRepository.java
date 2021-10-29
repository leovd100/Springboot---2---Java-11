package com.devsuperior.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.workshop.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
}
