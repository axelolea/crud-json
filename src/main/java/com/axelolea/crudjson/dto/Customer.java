package com.axelolea.crudjson.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Customer {

    private long id;
    @NotNull
    private String name;
    @NotNull
    @Email
    private String email;

}
