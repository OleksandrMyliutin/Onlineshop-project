create table if not exists customers (
    id uuid default uuid_generate_v4 (),
    name varchar not null,
    password varchar not null,
    phone_number varchar not null,
    location varchar not null,
    mail varchar not null,
    onlinewallet_id uuid,
    primary key (id),
    foreign key(onlinewallet_id) references onlinewallet(id)
);