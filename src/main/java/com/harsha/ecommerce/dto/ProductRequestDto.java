package com.harsha.ecommerce.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequestDto {

    @NotBlank(message = "Product Name Is Required")
    private String name;

    private String description;

    @NotNull(message ="Price Is Required")
    @Min(value = 1 , message = "Price Must Be Greater Than 0")
    private double price;

    @NotNull(message = "Stock Is Required")
    @Min(value = 0, message = "Stock Cannot Be Negative")
    private Integer Stock;
}
