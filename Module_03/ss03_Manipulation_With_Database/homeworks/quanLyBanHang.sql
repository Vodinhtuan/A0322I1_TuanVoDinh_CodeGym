CREATE DATABASE QuanLyBanHang;
USE QuanLyBanHang;
CREATE TABLE Customer (
    cID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    cName VARCHAR(50),
    cAGE INT
);

CREATE TABLE `Order` (
    oID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    cID INT,
    oDate DATE,
    oTotalPrice FLOAT,
    FOREIGN KEY (cID)
        REFERENCES Customer (cID)
);

CREATE TABLE OrderDetail (
    oID INT,
    pID INT,
    odQTY VARCHAR(100),
    PRIMARY KEY (oID , pID),
    FOREIGN KEY (oID)
        REFERENCES `Order` (oID),
    FOREIGN KEY (pID)
        REFERENCES Product (pID)
);

CREATE TABLE Product (
    pID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    pName VARCHAR(50),
    pPrice FLOAT
);

INSERT INTO Customer
	(cID, cName, cAge)
VALUE (1,'Minh Quan', 10),
	  (2, 'Ngoc Oanh', 20),
      (3, 'Hong Ha', 50);
	SELECT 
    *
FROM
    Customer;
INSERT INTO `Order` (oID, cID, oDate, oTotalPrice)
VALUE (1, 1, '2006-03-21', Null),
	  (2, 2, '2006-03-23', Null), 
      (3, 1, '2006-03-16', Null);
SELECT 
    *
FROM
    `Order`;
INSERT INTO Product (pID, pName, pPrice)
VALUE (1,'May Giat', 3),
	  (2, 'Tu Lanh', 5),
      (3, 'Dieu Hoa', 7),
      (4, 'Quat', 1),
      (5, 'Bep Dien', 2);
SELECT 
    *
FROM
    Product;
INSERT INTO OrderDetail (oID, pID, odQTY)
VALUE (1, 1, 3),
	  (1, 3, 7),
      (1, 4, 2),
      (2, 1, 1),
      (3, 1, 8),
      (2, 5, 4),
      (2, 3, 3);
      SELECT * FROM OrderDetail;
      
-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
SELECT oID, oDate, oTotalPrice FROM `Order`;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
SELECT C.cName, P.pName  
FROM Customer C JOIN `Order` O ON C.cID = O.cID 
				JOIN OrderDetail Od ON O.oID = Od.oID
                JOIN Product P ON Od.pID = P.pID;
                
-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào

SELECT C.cName
FROM Customer C 
WHERE cID NOT IN ( 
SELECT C.cID 
FROM Customer c JOIN `Order` O ON C.cID = O.cID);
-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn.
-- Giá bán của từng loại được tính = odQTY*pPrice)
SELECT O.oID, O.oDATE, Sum(IFNULL(Od.odQTY,0) * IFNULL(P.pPrice,0)) AS totalPrice
FROM `Order` O 
join OrderDetail Od on O.oID= Od.oID
join Product P on Od.pID = P.pID
group by O.oID;