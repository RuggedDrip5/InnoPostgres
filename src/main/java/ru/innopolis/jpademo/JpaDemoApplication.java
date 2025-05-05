package ru.innopolis.jpademo;

import jakarta.transaction.Transactional;
import org.hibernate.Hibernate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.innopolis.jpademo.repository.CustomerRepository;
import ru.innopolis.jpademo.repository.OrderRepository;

@SpringBootApplication
public class JpaDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }

    @Bean
    @Transactional
    public CommandLineRunner demo(CustomerRepository customerRepo, OrderRepository orderRepo) {
        return args -> {
            System.out.println("=== Customers ===");
            customerRepo.findAll().forEach(c -> {
                System.out.println(c);
                // Явная инициализация, если нужно
                Hibernate.initialize(c.getOrders());
            });

            System.out.println("=== Orders ===");
            orderRepo.findAll().forEach(System.out::println);
        };
    }

}