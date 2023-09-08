package com.axelolea.crudjson.service.imp;

import com.axelolea.crudjson.bean.JsonRepo;
import com.axelolea.crudjson.dto.CustomerDto;
import com.axelolea.crudjson.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {

    private final JsonRepo jsonRepo;
    @Autowired
    public CustomerServiceImpl(JsonRepo jsonRepo) {
        this.jsonRepo = jsonRepo;
    }

    @Override
    public List<CustomerDto> getAllCustomer() {
        return null;
    }

    @Override
    public CustomerDto getCustomerById(long id) {
        return null;
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customer) {
        return null;
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customer) {
        return null;
    }

    @Override
    public void deleteCustomer(long id) {

    }

}
