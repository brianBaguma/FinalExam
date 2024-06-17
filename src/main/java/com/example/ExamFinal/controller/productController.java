package com.example.ExamFinal.controller;

import com.example.ExamFinal.Dtos.request.productRequestDto;
import com.example.ExamFinal.model.Product;
import com.example.ExamFinal.service.productService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class productController {

    @Autowired
    private productService productService;


    @GetMapping
    public ResponseEntity<List<Product>> getAllProduct(){
        Optional<List<Product>> products = productService.findAll();
        if(products.isPresent()){
            return ResponseEntity.ok(products.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
//    public Optional<Product> addProduct(@RequestBody Product product){
//        return productService.save(product);
//    }
    public ResponseEntity<Product> createProduct(@Valid @RequestBody productRequestDto productRequestDto){
        Optional<Product> responseDto = productService.save(productRequestDto);
        if(responseDto.isPresent()){
            return ResponseEntity.ok(responseDto.get());
        }
        return ResponseEntity.notFound().build();
    }
}
