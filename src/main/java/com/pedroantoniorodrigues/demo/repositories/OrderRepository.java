package com.pedroantoniorodrigues.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedroantoniorodrigues.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
