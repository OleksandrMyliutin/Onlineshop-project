package com.onlineshop.model.dto;

import com.onlineshop.model.entity.OrderEntity;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.util.Set;

@Builder
public record CustomerDto(String id,
                          @Size(min=2, max=30, message = "Name must be from 2 to 30 chars")
                          String name,
                          @Pattern(regexp = "^(?=.*[A-Z].*[A-Z])(?=.*[!@#$&*])(?=.*[0-9].*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8}+$",  message = """
                    Password must has:
                    - two uppercase letters
                    - one special case letter
                    - two digits
                    - three lowercase letters - at least 8 symbols\s
                    """)
                          String password,
                          @Pattern(regexp = " ^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$",
                                  message = "Phone format is incorrect")
                          String phoneNumber,
                          @Size(min=2, max=30, message = "Location must be from 2 to 30 chars")
                          String location,
                          @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Wrong Email format")
                          String mail,
                          OnlineWalletDto onlineWalletDto, Set<OrderEntity> orderEntity) {}
