package com.emirim.gotoschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GotoschoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(GotoschoolApplication.class, args);
    }

}
