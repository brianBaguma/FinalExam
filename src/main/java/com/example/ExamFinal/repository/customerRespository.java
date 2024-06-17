package com.example.ExamFinal.repository;

import com.example.ExamFinal.model.customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface customerRespository extends JpaRepository<customer,Integer> {
    //List<customer> findByUsernmae(String email);
}
