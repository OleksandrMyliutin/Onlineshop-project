package com.onlineshop.model.dto;

import java.time.Instant;
import java.time.Instant;
import java.util.UUID;

    public record BasketDto(
            String id,
            CustomerDto customer,
            ProductDto product,
            double quantity,
            Instant createDate
    ) {}
