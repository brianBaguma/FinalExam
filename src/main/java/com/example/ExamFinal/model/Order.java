package com.example.ExamFinal.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String date;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private customer customer;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "order_products",
            joinColumns = @JoinColumn(name="order_id"),
    inverseJoinColumns = @JoinColumn(name = "product_id"))

    private List<Product> products;
}
