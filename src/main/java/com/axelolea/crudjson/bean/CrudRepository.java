package com.axelolea.crudjson.bean;

import com.axelolea.crudjson.dto.CustomerDto;

import java.util.List;
import java.util.Optional;

public interface CrudRepository {

    CustomerDto save (CustomerDto i);
    Optional<CustomerDto> findById(Long id);
    List<CustomerDto> findAll();
    void delete (Long id);
    CustomerDto update (Long id, CustomerDto t);

}
