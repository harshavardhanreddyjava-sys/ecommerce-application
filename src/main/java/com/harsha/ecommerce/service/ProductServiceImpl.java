package com.harsha.ecommerce.service;

import com.harsha.ecommerce.entity.Product;
import com.harsha.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id){
        return productRepository.findById(id).orElseThrow(()-> new RuntimeException());
    }
}
