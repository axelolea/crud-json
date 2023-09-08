package com.axelolea.crudjson.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CustomerDto {

    private long id;
    @NotEmpty
    @Size
    private String name;
    @NotEmpty
    @Email
    private String email;

}
