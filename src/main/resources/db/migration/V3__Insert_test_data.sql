INSERT INTO shop.customer (first_name, last_name) VALUES
                                                      ('Иван', 'Иванов'),
                                                      ('Петр', 'Петров');

INSERT INTO shop.order (customer_id, order_date, total_orders, discount) VALUES
                                                                             (1, NOW(), 5, 10.00),
                                                                             (2, NOW(), 3, 5.00);