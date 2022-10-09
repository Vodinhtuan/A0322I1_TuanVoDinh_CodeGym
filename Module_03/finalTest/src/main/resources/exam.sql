create database exam;
use exam;
create table category
(
	id int primary key auto_increment,
    name varchar(30)
);
create table product
(
	id int primary key auto_increment,
    name varchar(50),
    price double,
    quantity int,
    color varchar(50),
    `desc` varchar(200),
    id_category int not null,
    foreign key (id_category) references category(id)
);