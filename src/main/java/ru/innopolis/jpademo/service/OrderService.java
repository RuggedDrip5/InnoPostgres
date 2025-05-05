package ru.innopolis.jpademo.service;

import org.springframework.stereotype.Service;
import ru.innopolis.jpademo.model.Order;
import ru.innopolis.jpademo.repository.OrderRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> getOrdersByDate(LocalDateTime date) {
        return repository.findByOrderDate(date);
    }
}