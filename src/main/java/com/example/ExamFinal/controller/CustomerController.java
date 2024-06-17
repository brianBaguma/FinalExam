package com.example.ExamFinal.controller;

import com.example.ExamFinal.Dtos.request.CustomerRequestDto;
import com.example.ExamFinal.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/customers")

public class CustomerController {
    @Autowired
   //private MockMvc mockMvc;




    private final CustomerService customerService;




    @GetMapping
    public List<CustomerRequestDto>getAllCustomers() {
       Optional<List<CustomerRequestDto>> customers = customerService.getAllCustomers();
       if(!customers.isEmpty()) {
           return (List<CustomerRequestDto>) ResponseEntity.ok(customers);
       }
        return (List<CustomerRequestDto>) ResponseEntity.notFound().build();


    }

    @PostMapping
    public ResponseEntity<CustomerRequestDto> createCustomer(@RequestBody CustomerRequestDto customerRequestDto) {
        CustomerRequestDto createdCustomer = customerService.addCustomer(customerRequestDto);
        return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);
    }

//    @PostMapping
//    public CustomerRequestDto createCustomer(@RequestBody CustomerRequestDto customerRequestDto) {
//        return customerService.addCustomer(customerRequestDto);
//
//    }


}
