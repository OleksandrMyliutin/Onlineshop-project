create table if not exists category (
    id uuid default uuid_generate_v4(),
    name_category varchar not null,
    description varchar not null,
    primary key (id)
);