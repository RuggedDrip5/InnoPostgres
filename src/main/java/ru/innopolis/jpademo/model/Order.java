package ru.innopolis.jpademo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "`order`", schema = "shop") // для MySQL
@ToString(exclude = "customer") // Исключаем customer из toString()
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(name = "order_date", nullable = false)
    private LocalDateTime orderDate;

    @Column(name = "total_orders")
    private Integer totalOrders;

    @Column(name = "discount")
    private Double discount;
}