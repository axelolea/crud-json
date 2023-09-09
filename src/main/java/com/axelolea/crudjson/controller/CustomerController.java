package com.axelolea.crudjson.controller;


import com.axelolea.crudjson.dto.CustomerDto;
import com.axelolea.crudjson.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
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
        return ResponseEntity.ok(customer);
    }

    @PostMapping
    ResponseEntity<CustomerDto> createCustomer (
            @Valid @RequestBody CustomerDto customer,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            System.out.println(result.getAllErrors());
            return new ResponseEntity<>(customer, HttpStatus.I_AM_A_TEAPOT);
        }
        CustomerDto newCustomer = customerService.saveCustomer(customer);
        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    ResponseEntity<CustomerDto> updateCustomer (
            @PathVariable long id,
            @RequestBody CustomerDto customer
    ) {
        CustomerDto updateCustomer = customerService.updateCustomer(id, customer);
        return new ResponseEntity<>(updateCustomer, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomerWithId(@PathVariable long id) {
        customerService.deleteCustomer(id);
    }

}
