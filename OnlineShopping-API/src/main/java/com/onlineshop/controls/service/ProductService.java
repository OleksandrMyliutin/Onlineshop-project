package com.onlineshop.controls.service;

import edu.lemons.model.dto.ProductDto;
import edu.lemons.model.repository.ProductRepository;
import edu.lemons.utils.EntityToDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDto> getProductByproduct_name(String product_name) {
        return productRepository.findByproduct_name(product_name);
    }


    // TODO: Only for test purposes -> will be removed
    public List<ProductDto> getAllProducts() {
        return productRepository.findAll().stream()
                .map(EntityToDto::productEntityToDto)
                .toList();
    }



}