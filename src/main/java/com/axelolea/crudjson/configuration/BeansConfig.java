package com.axelolea.crudjson.configuration;

import com.axelolea.crudjson.bean.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    CustomerRepository JsonDBDependency () {
        return new CustomerRepository();
    }

}
