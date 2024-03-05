package com.onlineshop.controls.service;

import com.onlineshop.model.dto.CustomerDto;
import edu.lemons.model.dto.CustomerDto;
import edu.lemons.model.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customersRepository) {
        this.customerRepository = customersRepository;
    }

    public Optional<CustomerDto> getUserInfoByName(String name) {
        return customerRepository.findByName(name);
    }

    public Optional<CustomerDto> getCustomerByName(String name){
        return customerRepository.findByName(name);
    }
}