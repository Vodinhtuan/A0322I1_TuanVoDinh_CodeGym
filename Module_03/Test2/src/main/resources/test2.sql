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
    name varchar(50),
    phone int,
    ngayThue date,
    ghiChu varchar(200),
    maThanhToan int not null,
    foreign key (maThanhToan) references thanhToan(maThanhToan)
);
select * from thanhToan;
delete from thueTro where maPhong = 1;
select tt.maPhong, tt.name, tt.phone, tt.ngayThue, tt.ghiChu, th.maThanhToan from thanhToan th join thueTro tt on th.maThanhToan = th.maThanhToan;