CREATE DATABASE QuanLySinhVien;
USE QuanLySinhVien;
CREATE TABLE Class (
    ClassID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    ClassName VARCHAR(60) NOT NULL,
    StartDate DATETIME NOT NULL,
    Status BIT
);
CREATE TABLE Student (
    StudentID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    StudentName VARCHAR(30) NOT NULL,
    Address VARCHAR(50),
    Phone VARCHAR(20),
    Status BIT,
    ClassID INT NOT NULL,
    FOREIGN KEY (ClassID)
        REFERENCES Class (ClassID)
);
CREATE TABLE Subject (
    SubID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    SubName VARCHAR(30) NOT NULL,
    Credit TINYINT NOT NULL DEFAULT 1 CHECK (Credit >= 1),
    Status BIT DEFAULT 1
);
CREATE TABLE Mark (
    MarkID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    SubID INT NOT NULL UNIQUE KEY,
    StudentID INT NOT NULL UNIQUE KEY,
    Mark FLOAT DEFAULT 0 CHECK (Mark BETWEEN 0 AND 100),
    ExamTimes TINYINT DEFAULT 1,
    FOREIGN KEY (SubID)
        REFERENCES Subject (SubID),
    FOREIGN KEY (StudentID)
        REFERENCES Student (StudentID)
);

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
SELECT * FROM Subject
WHERE Credit = (SELECT MAX(Credit) FROM Subject); 
-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
SELECT s.subID, s.subName, MAX(m.Mark) 
FROM Subject s JOIN Mark m on s.SubID = m.SubID; 
-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, 
-- xếp hạng theo thứ tự điểm giảm dần
SELECT s.StudentID, s.StudentName, s.Address, s.Phone, AVG(m.Mark) AS dtb
FROM Student s JOIN Mark m ON s.StudentID = m.StudentID
GROUP BY s.StudentID
ORDER BY dtb, s.StudentName DESC;
