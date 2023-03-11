use THUCHANH;

-- Tạo bản ghi cho bảng PHONGBAN
INSERT INTO PHONGBAN (MAPB, TENPB) 
VALUES ('PB001', N'Phòng kế toán'),
	('PB002', N'Phòng nhân sự'),
	('PB003', N'Phòng sản xuất'),
	('PB004', N'Phòng kinh doanh'),
	('PB005', N'Phòng marketing');

-- Tạo bản ghi cho bảng CHUCVU
INSERT INTO CHUCVU (MACV, TECV, HSPC) 
VALUES ('CV001', N'Giám đốc', 2.0),
	('CV002', N'Trưởng phòng', 1.8),
	('CV003', N'Nhân viên', 1.2),
	('CV004', N'Kế toán viên', 1.4),
	('CV005', N'Nhân viên kinh doanh', 1.5);


-- Tạo bản ghi cho bảng HSLUONG
INSERT INTO HSLUONG (MAHSL, TDHV, HSL) 
VALUES ('HSL001', N'Đại học', 3.0),
	('HSL002', N'Cao đẳng', 2.34),
	('HSL003', N'Trung cấp', 1.92),
	('HSL004', N'Cử nhân', 3.33),
	('HSL005', N'Kỹ sư', 3.6);

-- Tạo bản ghi cho bảng NHANVIEN
INSERT INTO NHANVIEN (MANV, HOLOT, TENNV, PHAI, DIACHI, DTHOAI, MAPB, MACV)
VALUES ('NV001', N'Nguyễn', N'Văn A', N'Nam', N'Hà Nội', '0987654321', 'PB001', 'CV002'),
	('NV002', N'Trần', N'Thị B', N'Nữ', N'Đà Nẵng', '0123456789', 'PB002', 'CV003'),
	('NV003', N'Lê', N'Văn C', N'Nam', N'Hồ Chí Minh', '0123456789', 'PB003', 'CV003'),
	('NV004', N'Trần', N'Văn D', N'Nam', N'Nha Trang', '0987654321', 'PB001', 'CV003'),
	('NV005', N'Nguyễn', N'Thị E', N'Nữ', N'Hải Phòng', '0123456789', 'PB003', 'CV002');

-- Tạo bản ghi cho bảng LUONG
INSERT INTO LUONG (MANV, MAHSL, THANG) 
VALUES ('NV001', 'HSL001', '2022-01-01'),
	('NV002', 'HSL002', '2022-01-01'),
	('NV003', 'HSL003', '2022-01-01'),
	('NV004', 'HSL004', '2022-01-01'),
	('NV005', 'HSL005', '2022-01-01');

INSERT INTO NHANVIEN (MANV, HOLOT, TENNV, PHAI, DIACHI, DTHOAI, MAPB, MACV) 
VALUES ('NV006', N'Nguyễn', N'HONG', N'Nam', N'Hà Nội', '0907654325', 'PB001', 'CV002');