package com.axelolea.crudjson.bean;

import com.axelolea.crudjson.dto.CustomerDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
public class CustomerJson implements Cloneable {
    private List<CustomerDto> data;
    private long serialOffset;

    public CustomerJson(long serialOffset) {
        this.serialOffset = serialOffset;
        this.data = new ArrayList<>();
    }

    public void autoincrement () {
        this.serialOffset++;
    }

    @Override
    public CustomerJson clone() {
        try {
            return (CustomerJson) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
