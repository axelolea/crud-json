package com.axelolea.crudjson.bean;

import com.axelolea.crudjson.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerRepository implements CrudRepository {

    JsonDriver driver;
    @Autowired
    public CustomerRepository(JsonDriver jsonDriver) {
        this.driver = jsonDriver;
    }

    @Override
    public CustomerDto save(CustomerDto customer) {

        CustomerJson data = driver.getJsonData();
        long offset = data.getSerialOffset();

        customer.setId(offset);

        data.getData().add(customer);
        data.autoincrement();

        driver.setJsonData(data);

        return customer;
    }

    @Override
    public Optional<CustomerDto> findById(Long id) {

        return driver.getJsonData().getData().stream()
                .filter(o -> o.getId() == id)
                .findFirst();

    }

    @Override
    public List<CustomerDto> findAll() {
        return driver.getJsonData().getData();
    }

    @Override
    public void delete(Long id) {
        CustomerJson data = driver.getJsonData();

        List<CustomerDto> customerList = data.getData().stream()
                .filter(obj -> obj.getId() != id)
                .toList();

        if(customerList.isEmpty()) {
            data.setData(new ArrayList<>());
        } else {
            data.setData(customerList);
        }

        driver.setJsonData(data);
    }

    @Override
    public CustomerDto update(Long id, CustomerDto customer) {
        CustomerJson data = driver.getJsonData();

        CustomerDto newCustomer = CustomerDto.builder()
                .id(id)
                .name(customer.getName())
                .email(customer.getEmail())
                .build();

        List<CustomerDto> customerList = data.getData().stream()
                .map(obj -> {
                    if(obj.getId() != id)
                        return obj;
                    return newCustomer;
                })
                .toList();

        if(customerList.isEmpty()) {
            data.setData(new ArrayList<>());
        } else {
            data.setData(customerList);
        }

        driver.setJsonData(data);

        return newCustomer;
    }

}
