CREATE TABLE shop.customer (
                               id SERIAL PRIMARY KEY,
                               first_name VARCHAR(50) NOT NULL,
                               last_name VARCHAR(50) NOT NULL
);

CREATE TABLE shop.order (
                            id SERIAL PRIMARY KEY,
                            customer_id INTEGER NOT NULL REFERENCES shop.customer(id),
                            order_date TIMESTAMP NOT NULL,
                            total_orders INTEGER DEFAULT 0,
                            discount DECIMAL(5,2) DEFAULT 0.00
);