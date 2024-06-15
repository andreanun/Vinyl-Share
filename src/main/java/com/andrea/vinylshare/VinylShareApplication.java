package com.andrea.vinylshare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class VinylShareApplication {

    public static void main(String[] args) {
        SpringApplication.run(VinylShareApplication.class, args);
    }

}
