package com.example.crud.service.impl;

import com.example.crud.dto.CustomerDto;
import com.example.crud.repository.CustomerRepo;
import com.example.crud.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;

    public CustomerServiceImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public CustomerDto saveCustomer() {
        return null;
    }

    @Override
    public CustomerDto deleteCustomer() {
        return null;
    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        return List.of();
    }

    @Override
    public CustomerDto updateCustomer() {
        return null;
    }

    @Override
    public CustomerDto getCustomerById() {
        return null;
    }

    @Override
    public CustomerDto getCustomerByEmail() {
        return null;
    }
}
