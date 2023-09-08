package com.axelolea.crudjson.controller;


import com.axelolea.crudjson.dto.CustomerDto;
import com.axelolea.crudjson.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${customer-path}")
public class CustomerController {

    private final CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<List<CustomerDto>> getAllCustomers () {
        List<CustomerDto> customerList = customerService.getAllCustomer();
        return ResponseEntity.ok(customerList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDto> getCustomerWithId (@PathVariable long id) {
        CustomerDto customer = customerService.getCustomerById(id);
        return ResponseEntity.ok(null);
    }

    @PostMapping
    ResponseEntity<CustomerDto> createCustomer (@Valid @RequestBody CustomerDto customer) {
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    ResponseEntity<CustomerDto> updateCustomer (
            @PathVariable long id,
            @RequestBody CustomerDto customer
    ) {
        customer.setId(id);
        return new ResponseEntity<>(customer, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomerWithId(@PathVariable long id) {

    }

}
