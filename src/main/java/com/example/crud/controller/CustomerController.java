package com.example.crud.controller;

import com.example.crud.dto.CustomerDto;
import com.example.crud.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

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
    public ResponseEntity<Object> deleteCustomer(@PathVariable Integer id){
        CustomerDto delete = customerService.deleteCustomer(id);

        if(delete != null){
            return new ResponseEntity<>(delete, HttpStatus.OK);
        }else{
            HashMap<String, Object> res = new HashMap<>();
            res.put("message", "Customer not found");

            return new ResponseEntity<>(res, HttpStatus.NOT_FOUND);
        }
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
