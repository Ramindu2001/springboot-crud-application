package com.example.crud.controller;

import com.example.crud.dto.CustomerDto;
import com.example.crud.entity.Customer;
import com.example.crud.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Optional;

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

    @PutMapping("/update/{id}")
    public ResponseEntity<CustomerDto> updateCustomer(@PathVariable Integer id, @RequestBody CustomerDto customerDto){
        customerDto.setId(id);
        CustomerDto update = customerService.updateCustomer(customerDto);
        if(update != null){
            return new ResponseEntity<>(update, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable Integer id){
        CustomerDto customerById = customerService.getCustomerById(id);
        if(customerById != null){
            return new ResponseEntity<>(customerById, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/getEmail/{email:.+}")
    public ResponseEntity<CustomerDto> getCustomerByEmail(@PathVariable String email){
        CustomerDto customerByEmail = customerService.getCustomerByEmail(email);

        if (customerByEmail != null) {
            return new ResponseEntity<>(customerByEmail, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
