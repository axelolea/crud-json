package com.axelolea.crudjson.service;

import com.axelolea.crudjson.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    List<CustomerDto> getAllCustomer ();
    CustomerDto getCustomerById(long id);
    CustomerDto saveCustomer(CustomerDto customer);
    CustomerDto updateCustomer(long id, CustomerDto customer);
    void deleteCustomer(long id);

}
