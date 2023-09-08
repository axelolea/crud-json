package com.axelolea.crudjson.configuration;

import com.axelolea.crudjson.bean.JsonRepo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    JsonRepo JsonDBDependency () {
        return new JsonRepo();
    }

}
