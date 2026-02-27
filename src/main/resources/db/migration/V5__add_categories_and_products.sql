create table categories
(
    id   TINYINT auto_increment
        primary key,
    name varchar(255) not null
);

create table products
(
    id          BIGINT auto_increment
        primary key,
    name        varchar(255)   not null,
    price       DECIMAL(10, 2) not null,
    category_id TINYINT        not null,
    constraint fk_category
        foreign key (category_id) references categories (id)
            ON DELETE RESTRICT
);

