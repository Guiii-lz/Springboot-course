package com.example.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
