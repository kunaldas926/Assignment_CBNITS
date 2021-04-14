package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class db {

  private static final Logger log = LoggerFactory.getLogger(db.class);

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Employee(1, "abc", "ceo")));
      log.info("Preloading " + repository.save(new Employee(2, "def", "cto")));
      log.info("Preloading " + repository.save(new Employee(3, "ghi", "hr")));
    };
  }
}