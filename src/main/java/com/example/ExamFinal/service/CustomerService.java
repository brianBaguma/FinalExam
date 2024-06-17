package com.example.ExamFinal.service;

import com.example.ExamFinal.Dtos.request.CustomerRequestDto;
import com.example.ExamFinal.Dtos.response.CustomerResponseDto;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.*;
@Service
public interface CustomerService {
//    Optional<CustomerResponseDto> addCustomer(CustomerRequestDto customerRequestDto);
//    List<CustomerResponseDto> getAllCustomers();
//    Optional<CustomerResponseDto> getCustomerById(Long id);
//    Optional<CustomerResponseDto> updateCustomer(Long id, CustomerRequestDto customerRequestDto);
//    Optional<CustomerResponseDto> deleteCustomer(Long id);

      //List<CustomerResponseDto> getAllCustomers();
      Optional<List<CustomerRequestDto>> getAllCustomers();
      CustomerRequestDto addCustomer(CustomerRequestDto customerRequestDto);
}
