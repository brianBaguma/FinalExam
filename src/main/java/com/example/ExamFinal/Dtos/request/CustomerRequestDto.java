package com.example.ExamFinal.Dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequestDto {

    private long id;
    private String email;
    private String name;

}
