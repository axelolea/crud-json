package com.axelolea.crudjson.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    private long id;
    @NotEmpty(message = "Required a name of customer")
    @Size
    private String name;
    @NotEmpty(message = "Required a email of customer")
    @Email(message = "Email is invalid")
    private String email;

}
