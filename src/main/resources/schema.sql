create database if not exists shoppingsystem;
create table shoppingsystem.customer (
                                         id bigint not null unique primary key auto_increment,
                                         name varchar(50) not null,
                                         gender varchar(10) not null,
                                         email varchar(50) not null unique,
                                         wallet decimal(2,0) null
);