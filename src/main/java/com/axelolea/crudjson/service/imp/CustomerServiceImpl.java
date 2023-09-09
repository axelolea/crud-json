package com.axelolea.crudjson.service.imp;

import com.axelolea.crudjson.bean.CustomerRepository;
import com.axelolea.crudjson.dto.CustomerDto;
import com.axelolea.crudjson.exception.NotFoundCustomerException;
import com.axelolea.crudjson.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepo;
    @Autowired
    public CustomerServiceImpl(CustomerRepository jsonRepo) {
        this.customerRepo = jsonRepo;
    }

    @Override
    public List<CustomerDto> getAllCustomer() {
        return customerRepo.findAll();
    }

    @Override
    public CustomerDto getCustomerById(long id) {
        return customerRepo.findById(id)
                .orElseThrow(() -> new NotFoundCustomerException("Not found customer with Id: " + id));
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customer) {
        return customerRepo.save(customer);
    }

    @Override
    public CustomerDto updateCustomer(long id, CustomerDto customer) {
        return customerRepo.update(id, customer);
    }

    @Override
    public void deleteCustomer(long id) {
        customerRepo.delete(id);
    }

}
