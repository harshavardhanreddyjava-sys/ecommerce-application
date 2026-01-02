package com.harsha.ecommerce.service;

import com.harsha.ecommerce.entity.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(Long id);
}
