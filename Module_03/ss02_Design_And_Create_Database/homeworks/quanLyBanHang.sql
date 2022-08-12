CREATE DATABASE QuanLyBanHang;
USE QuanLyBanHang;
CREATE TABLE Customer(
	cID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    cName VARCHAR(50),
    cAGE INT
);

CREATE TABLE `Order`(
	oID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    cID INT,
    oDate DATE,
    oTotalPrice FLOAT,
    FOREIGN KEY (cID) REFERENCES Customer (cID)
);

CREATE TABLE OrderDetail(
	oID INT,
    pID INT,
    odQTY VARCHAR(100),
    PRIMARY KEY (oID, pID),
    FOREIGN KEY (oID) REFERENCES `Order` (oID),
    FOREIGN KEY (pID) REFERENCES Product (pID)
);

CREATE TABLE Product(
    pID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    pName VARCHAR(50),
    pPrice FLOAT
);
