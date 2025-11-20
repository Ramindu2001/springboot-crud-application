package com.example.crud.service;

import com.example.crud.dto.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

    public CustomerDto saveCustomer(CustomerDto customerDto);

    public CustomerDto deleteCustomer(Integer id);

    public List<CustomerDto> getAllCustomers();

    public CustomerDto updateCustomer(CustomerDto customerDto);

    public CustomerDto getCustomerById(Integer id);

    public CustomerDto getCustomerByEmail(String email);
}
