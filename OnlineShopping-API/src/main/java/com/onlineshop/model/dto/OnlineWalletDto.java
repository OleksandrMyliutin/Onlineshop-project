package com.onlineshop.model.dto;
import java.util.UUID;

import jakarta.validation.constraints.Pattern;
import lombok.Builder;


@Builder
public record OnlineWalletDto (String id,
                               @Pattern(regexp = "^(?=.*[0-9]).{16}+$", message = "Wrong creditCard format")
                               String creditCard,
                               CustomerDto customerDto){}
