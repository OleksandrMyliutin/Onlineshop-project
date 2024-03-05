package com.onlineshop.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import java.math.BigDecimal;
import java.time.Instant;

@Builder
public record ProductDto (String id,
                          @Size(min=2, max=30, message = "Product name must be from 2 to 30 chars")
                          String product_name,
                          Instant dateAdd,
                          @Min(value = 1, message = "Products price should be more than 0")
                          BigDecimal price,
                          Supplier supplier,
                          CategoryDto categoryDto) {}
