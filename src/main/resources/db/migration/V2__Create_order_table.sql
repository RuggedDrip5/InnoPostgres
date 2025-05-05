CREATE TABLE "order" (
                         id SERIAL PRIMARY KEY,
                         customer_id INTEGER REFERENCES customer(id),
                         order_date TIMESTAMP NOT NULL,
                         total_orders INTEGER DEFAULT 0,
                         discount DECIMAL(5, 2) DEFAULT 0.00
);