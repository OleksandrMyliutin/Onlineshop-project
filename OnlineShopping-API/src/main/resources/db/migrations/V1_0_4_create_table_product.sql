create table if not exists product (
    id uuid default uuid_generate_v4(),
    name varchar not null,
    product_name varchar unique not null,
    date_add timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    price numeric not null,
    primary key (id)
);