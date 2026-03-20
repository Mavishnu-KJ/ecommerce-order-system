package com.example.productservice.service;

import com.example.productservice.model.dto.ProductRequestDto;
import com.example.productservice.model.dto.ProductResponseDto;

import java.util.List;

public interface ProductService {
    ProductResponseDto createProduct(ProductRequestDto productRequestDto);
    ProductResponseDto getProductById(Long id);
    List<ProductResponseDto> getAllProducts();
    List<ProductResponseDto> getProductsByCategory(String category);
}
