package com.harsha.ecommerce.service;

import com.harsha.ecommerce.dto.ProductRequestDto;
import com.harsha.ecommerce.dto.ProductResponseDto;
import com.harsha.ecommerce.entity.Product;

import java.util.List;

public interface ProductService {
    ProductResponseDto createProduct(ProductRequestDto product);

    List<ProductResponseDto> getAllProducts();

    ProductResponseDto getProductById(Long id);
}
