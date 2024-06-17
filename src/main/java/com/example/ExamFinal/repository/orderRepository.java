package com.example.ExamFinal.repository;

import com.example.ExamFinal.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderRepository extends JpaRepository<Order,Integer> {
    Order findByOrderId(int orderId);
}
