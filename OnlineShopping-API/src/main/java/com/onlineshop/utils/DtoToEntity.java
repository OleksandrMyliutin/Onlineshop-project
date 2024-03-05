package com.onlineshop.utils;

import edu.lemons.model.dto.CustomerDto;
import edu.lemons.model.dto.ProductDto;
import edu.lemons.model.entity.CustomerEntity;
import edu.lemons.model.entity.ProductEntity;

public class DtoToEntity {
    public static CustomerEntity customerDtoToEntity(CustomerDto customerDto) {
        return CustomerEntity.builder()
                .name(customerDto.name())
                .password(customerDto.password())
                .phone_number(customerDto.phoneNumber())
                .location(customerDto.location())
                .mail(customerDto.mail())
                .build();
    }

    public static ProductEntity productDtoToEntity(ProductDto productDto) {
        return ProductEntity.builder()
                .product_name(productDto.product_name())
                .date_add(productDto.dateAdd())
                .price(productDto.price())
                .build();
    }
}