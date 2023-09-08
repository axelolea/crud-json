package com.axelolea.crudjson.controller;


import com.axelolea.crudjson.dto.Customer;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${customer-path}")
public class CustomerController {

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers () {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerWithId (@PathVariable long id) {

        return ResponseEntity.ok(null);

    }

    @PostMapping
    ResponseEntity<Customer> createCustomer (@Valid @RequestBody Customer customer) {
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    ResponseEntity<Customer> updateCustomer (
            @PathVariable long id,
            @RequestBody Customer customer
    ) {
        customer.setId(id);
        return new ResponseEntity<>(customer, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomerWithId(@PathVariable long id) {

    }

}
