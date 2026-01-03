package com.harsha.ecommerce.controller;

import com.harsha.ecommerce.dto.ProductRequestDto;
import com.harsha.ecommerce.dto.ProductResponseDto;
import com.harsha.ecommerce.entity.Product;
import com.harsha.ecommerce.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    // CREATE PRODUCT
    @PostMapping
    public ProductResponseDto createProduct(
            @Valid @RequestBody ProductRequestDto dto) {
        return productService.createProduct(dto);
    }


    // GET ALL PRODUCTS
    @GetMapping
    public List<ProductResponseDto> getAllProducts(){
        return productService.getAllProducts();
    }

    // GET PRODUCT BY ID
    @GetMapping("/{id}")
    public ProductResponseDto getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }

}
