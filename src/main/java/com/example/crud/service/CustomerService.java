package com.example.crud.service;

import com.example.crud.dto.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

    public CustomerDto saveCustomer();

    public CustomerDto deleteCustomer();

    public List<CustomerDto> getAllCustomers();

    public CustomerDto updateCustomer();

    public CustomerDto getCustomerById();

    public CustomerDto getCustomerByEmail();
}
