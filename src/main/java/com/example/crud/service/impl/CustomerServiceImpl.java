package com.example.crud.service.impl;

import com.example.crud.dto.CustomerDto;
import com.example.crud.entity.Customer;
import com.example.crud.repository.CustomerRepo;
import com.example.crud.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<Customer> byId = customerRepo.findById(id);

        if (byId.isPresent()) {
            customerRepo.deleteById(id);
            Customer customer = byId.get();
            return new CustomerDto(customer.getId(), customer.getName(), customer.getSalary(), customer.getEmail());
        }
        return null;
    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        return List.of();
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customerDto) {
        Optional<Customer> byId = customerRepo.findById(customerDto.getId());

        if (byId.isPresent()) {
            Customer cus = byId.get();

            cus.setName(customerDto.getName());
            cus.setSalary(customerDto.getSalary());
            cus.setEmail(customerDto.getEmail());

            Customer update = customerRepo.save(cus);
            return new CustomerDto(update.getId(), update.getName(), update.getSalary(), update.getEmail());
        }
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
