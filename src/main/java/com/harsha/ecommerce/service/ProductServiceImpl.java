package com.harsha.ecommerce.service;

import com.harsha.ecommerce.dto.ProductRequestDto;
import com.harsha.ecommerce.dto.ProductResponseDto;
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
    public ProductResponseDto createProduct(ProductRequestDto dto) {

        Product product = new Product();
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        product.setStock(dto.getStock());

        Product saved = productRepository.save(product);

        return new ProductResponseDto(
                saved.getId(),
                saved.getName(),
                saved.getDescription(),
                saved.getPrice(),
                saved.getStock()
        );
    }


    @Override
    public List<ProductResponseDto> getAllProducts() {

        List<Product> products = productRepository.findAll();

        return products.stream()
                .map(product -> new ProductResponseDto(
                        product.getId(),
                        product.getName(),
                        product.getDescription(),
                        product.getPrice(),
                        product.getStock()
                ))
                .toList();
    }


    @Override
    public ProductResponseDto getProductById(Long id) {

        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));

        return new ProductResponseDto(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getStock()
        );
    }

}
