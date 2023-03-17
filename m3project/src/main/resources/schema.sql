create table public.users (
    id int auto_increment,
    email varchar(255) not null,
    created_at timestamp default current_timestamp,
    primary key (id)
);

create table public.concerts (
    id int auto_increment,
    artist varchar(255),
    concert_date datetime,  
    tickets_available int,
    ticket_price float, 
    created_at timestamp default current_timestamp,
    primary key (id)
);