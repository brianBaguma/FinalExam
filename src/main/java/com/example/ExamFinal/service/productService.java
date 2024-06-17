package com.example.ExamFinal.service;

import com.example.ExamFinal.Dtos.request.productRequestDto;
import com.example.ExamFinal.model.Product;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface productService {
    Optional<Product> findById(Integer id);
    Optional<List<Product>> findAll();
    Optional<Product> save(@Valid productRequestDto product);
}
