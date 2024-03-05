create table if not exists baskets (
    id uuid default uuid_generate_v4(),
    customer_id uuid not null,
    product_id uuid not null,
    quantity double precision DEFAULT 1.0,
    create_date timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    primary key (id, customer_id, product_id),
    foreign key(customer_id) references customers(id),
    foreign key(product_id) references products(id)
);