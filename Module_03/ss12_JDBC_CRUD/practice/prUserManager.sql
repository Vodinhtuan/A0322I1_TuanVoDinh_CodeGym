CREATE DATABASE practiceJDBCcRUD;
USE practiceJDBCcRUD;
create table users(
	id int(3) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    email varchar(120) NOT NULL,
    country varchar(120),
    PRIMARY KEY (id)
);
Insert into users(name, email, country)
value('Minh', 'minh@codegym.vn','VietNam');
insert into users(name, email, country) 
values('Kante','kante@che.uk','Kenia');