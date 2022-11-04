create database finalModule3;
use finalModule3;
create table category
(
	category_id int primary key auto_increment,
    name_category varchar(30)
);
create table product
(
	product_id int primary key auto_increment,
    name varchar(50),
    price double,
    quantity int,
    color varchar(50),
    `description` varchar(200),
    category_id int not null,
    foreign key (category_id) references category(category_id)
);