package com.example.ExamFinal.controller;

import com.example.ExamFinal.Dtos.request.OrderRequestDto;
import com.example.ExamFinal.model.Order;
import com.example.ExamFinal.service.orderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/orders")
public class orderController {
    @Autowired
    private orderService orderService;

    @GetMapping
//    public List<Order> getAllOrders(){
//        return orderService.findAll();
//    }
    public ResponseEntity<List<Order>> findAll(){
        Optional<List<Order>> responseDtos = Optional.ofNullable(orderService.findAll());
        if(responseDtos.isPresent()){
            return ResponseEntity.ok().body(responseDtos.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
//    public Optional<Order> createOrder(@RequestBody OrderRequestDto orderRequestDto){
//        return orderService.save(orderRequestDto);
//    }
    public ResponseEntity<Order> create(@Valid @RequestBody OrderRequestDto orderRequestDto){
        Optional<Order> responseDto = orderService.save(orderRequestDto);
        if (responseDto.isPresent()) {
            return ResponseEntity.ok().body(responseDto.get());
        }
        return ResponseEntity.notFound().build();
    }

    //pagination and sorting
    @GetMapping("{customerId}/{pageNumber}/{pageSize}/{sortDirection}/{sortBy}")
    public Page<OrderRequestDto> findAll(@PathVariable Long id , @PathVariable Integer pageNumber,
                                         @PathVariable Integer pageSize, @PathVariable String sortDirection,
                                         @PathVariable String sortBy){

        Sort.Direction direction = Sort.Direction.fromString(sortDirection);
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, direction, sortBy);
        return orderService.findAll(pageRequest);

    }


}
