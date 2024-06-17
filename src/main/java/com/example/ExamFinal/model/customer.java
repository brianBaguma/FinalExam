package com.example.ExamFinal.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableMBeanExport;

import java.util.List;

@Entity
@Table(name = "Customers")
@Data
@NoArgsConstructor
public class customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //@Column(unique = true, nullable = false , updatable = true)
    private String name;

    private String email;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;


}
