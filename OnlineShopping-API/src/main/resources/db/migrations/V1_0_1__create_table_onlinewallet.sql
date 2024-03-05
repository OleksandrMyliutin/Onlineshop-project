create extension if not exists "uuid-ossp";

create table if not exists onlinewallet (
    id uuid default uuid_generate_v4(),
    tax_id bigint unique not null,
    credit_card varchar not null,
    primary key (id)
);