package com.example.lab1_fullstack;

import com.example.lab1_fullstack.entities.User;
import com.example.lab1_fullstack.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class Lab1FullStackApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab1FullStackApplication.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            Stream.of("Alibek", "Ruslan", "Danil", "Alexander", "Nurbol").forEach(name -> {
                User user = new User(name, name.toLowerCase() + "@gmail.com");
                userRepository.save(user);
            });
            userRepository.findAll().forEach(System.out::println);
        };
    }

}
