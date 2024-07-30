package org.example;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("Product1")
    public Product getProduct1(){
        return new Product(11,"GTA V",5000.00);
    }
}
