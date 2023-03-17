create table public.users (
    id int auto_increment,
    email varchar(255) not null,
    created_at timestamp default current_timestamp,
    primary key (id)
);

create table public.tickets (
    id int auto_increment,
    created_at timestamp default current_timestamp,
    submission_status boolean default false,
    concert_id int,
    user_id int,
    seat_id varchar(255),
    primary key (id)
);