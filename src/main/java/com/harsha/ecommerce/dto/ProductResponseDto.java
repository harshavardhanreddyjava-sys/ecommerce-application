package com.harsha.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public class ProductResponseDto {

    private Long id;
    private String name;
    private String description;
    private double price;
    private int stock;
}
