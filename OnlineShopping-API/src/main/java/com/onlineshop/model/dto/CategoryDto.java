package com.onlineshop.model.dto;

import lombok.Builder;


@Builder

public record CategoryDto(String id, String nameCategory, String description, ProductDto productDto) {}
