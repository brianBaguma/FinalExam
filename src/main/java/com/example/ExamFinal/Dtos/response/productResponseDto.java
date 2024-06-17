package com.example.ExamFinal.Dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class productResponseDto {
    private String productName;
    private String productDescription;
}
