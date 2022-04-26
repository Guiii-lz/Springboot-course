package com.example.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
