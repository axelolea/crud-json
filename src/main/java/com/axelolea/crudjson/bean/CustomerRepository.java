package com.axelolea.crudjson.bean;

import com.axelolea.crudjson.dto.CustomerDto;

import java.util.List;
import java.util.Optional;

public class CustomerRepository implements CrudRepository<CustomerDto, Long> {

    @Override
    public CustomerDto save(CustomerDto i) {
        return null;
    }

    @Override
    public Optional<CustomerDto> findById(Long id) {
        return null;
    }

    @Override
    public List<CustomerDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public CustomerDto update(Long id, CustomerDto customerDto) {
        return null;
    }
}
