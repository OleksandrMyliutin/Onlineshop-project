package com.onlineshop.model.dto;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public record Supplier (String id,
                        @Size(min=2, max=30, message = "Name of company name must be from 2 to 30 chars")
                        String  nameCompany,
                        @Pattern(regexp = " ^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$",
                                message = "Phone format is incorrect")
                        String phone,
                        String address,
                        @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Wrong Email format")
                        String mail,
                        ProductDto productDto){}
