package com.onlineshop.utils;

import edu.lemons.model.dto.CategoryDto;
import edu.lemons.model.dto.ProductDto;
import edu.lemons.model.entity.CategoryEntity;
import edu.lemons.model.entity.ProductEntity;



public class EntityToDto {

    public static ProductDto productEntityToDto(ProductEntity productEntity) {
        return ProductDto.builder()
                .product_name(productEntity.getProduct_name())
                .dateAdd(productEntity.getDate_add())
                .price(productEntity.getPrice())
                .build();
    }

    public static CategoryDto categoryEntityToDto(CategoryEntity categoriesEntity) {
        return CategoryDto.builder()
                .nameCategory(categoriesEntity.getName_category())
                .description(categoriesEntity.getDescription())
                .build();
    }

}