package com.example.crud.controller;

import com.example.crud.dto.CustomerDto;
import com.example.crud.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/save")
    public ResponseEntity<CustomerDto> saveCustomer(@RequestBody CustomerDto customerDto) {
         CustomerDto result =  customerService.saveCustomer(customerDto);
         return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer() {
        // Implementation for deleting a customer
    }

    @GetMapping("getAll")
    public void getAllCustomers() {
        // Implementation for retrieving all customers
    }

    @PutMapping("/update")
    public void updateCustomer() {
        // Implementation for updating a customer
    }

    @GetMapping("/getById/{id}")
    public void getCustomerById() {
        // Implementation for retrieving a customer by ID
    }

    @GetMapping("/getByEmail")
    public void getCustomerByEmail() {
        // Implementation for retrieving a customer by email
    }
}
