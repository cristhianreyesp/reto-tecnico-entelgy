package com.retotecnico.config;

import com.retotecnico.servicio.AnimalServicio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigAplicacion {

    @Bean
    public AnimalServicio animalServicio() {
        return new AnimalServicio();
    }
}
