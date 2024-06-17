package com.example.ExamFinal.service;

import com.example.ExamFinal.Dtos.request.OrderRequestDto;
import com.example.ExamFinal.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface orderService {
    Optional <Order> findById(Integer id);
    List<Order> findAll();
    //add an order
    Optional <Order> save(OrderRequestDto order);

    public Page<OrderRequestDto> findAll( Pageable pageable);
}
