package com.example.ExamFinal.Dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponseDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
