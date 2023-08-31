package com.example.flyway;

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
    @Bean
    public FlywayMigrationStrategy flywayMigrationStrategy(){
        return flyway -> {
            flyway.repair();
            flyway.migrate();
        };
    }
}
