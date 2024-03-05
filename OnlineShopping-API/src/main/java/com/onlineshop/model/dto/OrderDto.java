package com.onlineshop.model.dto;

import jakarta.validation.constraints.Min;
import lombok.Builder;

import java.time.Instant;

@Builder
public record OrderDto(String id,
                       @Min(value = 1, message = "Products quantity should be more than 0")
                       double productQuantity,
                       Instant dateTime,
                       CustomerDto customerDto,
                       ProductDto productDto) {

}
