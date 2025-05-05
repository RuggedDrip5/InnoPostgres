package ru.innopolis.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.innopolis.jpademo.model.Customer;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}