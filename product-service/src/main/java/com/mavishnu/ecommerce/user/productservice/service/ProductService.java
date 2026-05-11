package com.mavishnu.ecommerce.user.productservice.service;

import com.mavishnu.ecommerce.user.productservice.model.dto.ProductRequestDto;
import com.mavishnu.ecommerce.user.productservice.model.dto.ProductResponseDto;

import java.util.List;

public interface ProductService {
    ProductResponseDto createProduct(ProductRequestDto productRequestDto);
    ProductResponseDto getProductById(Long id);
    List<ProductResponseDto> getAllProducts();
    List<ProductResponseDto> getProductsByCategory(String category);
}
