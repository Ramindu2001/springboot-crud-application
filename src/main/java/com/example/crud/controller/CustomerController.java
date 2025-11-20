package com.example.crud.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @PostMapping("/save")
    public void saveCustomer() {
        // Implementation for saving a customer
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
