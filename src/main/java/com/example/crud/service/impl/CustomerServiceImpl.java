package com.example.crud.service.impl;

import com.example.crud.dto.CustomerDto;
import com.example.crud.entity.Customer;
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
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        Customer save = customerRepo.save(new Customer(customerDto.getName(), customerDto.getSalary(), customerDto.getEmail()));
        return new CustomerDto(save.getId(), save.getName(), save.getSalary(), save.getEmail());
    }

    @Override
    public CustomerDto deleteCustomer(Integer id) {
        return null;
    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        return List.of();
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customerDto) {
        return null;
    }

    @Override
    public CustomerDto getCustomerById(Integer id) {
        return null;
    }

    @Override
    public CustomerDto getCustomerByEmail(String email) {
        return null;
    }
}
