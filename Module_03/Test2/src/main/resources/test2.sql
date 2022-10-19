create database test2;
use test2;
create table thanhToan
(
	maThanhToan int primary key auto_increment,
    cachThanhToan varchar(30)
);
create table thueTro
(
	maPhong int primary key auto_increment,
    name varchar(30),
    phone int,
    ngayThue date,
    maThanhToan int not null,
    foreign key (maThanhToan) references thanhToan(maThanhToan)
);