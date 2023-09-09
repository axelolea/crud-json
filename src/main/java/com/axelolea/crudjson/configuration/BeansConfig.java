package com.axelolea.crudjson.configuration;

import com.axelolea.crudjson.bean.CustomerRepository;
import com.axelolea.crudjson.bean.JsonDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Value("${customer-file}")
    private String nameFile;

    @Bean
    CustomerRepository customerRepoBean () {
        return new CustomerRepository(jsonDriverBean());
    }

    @Bean
    JsonDriver jsonDriverBean () {
        return new JsonDriver(nameFile);
    }

}
