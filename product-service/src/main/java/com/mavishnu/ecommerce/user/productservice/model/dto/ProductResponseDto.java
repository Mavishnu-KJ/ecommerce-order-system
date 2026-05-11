package com.mavishnu.ecommerce.user.productservice.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductResponseDto {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private Integer stockQuantity;
    private String category;

}
