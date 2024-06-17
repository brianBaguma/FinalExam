package com.example.ExamFinal.repository;

import com.example.ExamFinal.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface productRepository extends JpaRepository<Product,Integer> {


List<Product> findByCategory(String category);}
