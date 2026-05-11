package com.mavishnu.ecommerce.user.productservice.repository;

import com.mavishnu.ecommerce.user.productservice.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategory(String category);
    List<Product> findByPriceBetween(Double minPrice, Double maxPrice);

}
