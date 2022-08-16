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
SELECT Address, COUNT(StudentID) AS 'Số lượng học viên'
FROM Student
GROUP BY Address;

SELECT s.StudentID, s.StudentName, AVG(m.Mark) AS 'Điểm trung bình'
FROM Student s JOIN Mark m ON s.StudentID = m.StudentID
GROUP BY StudentName;

SELECT s.StudentID, s.StudentName, AVG(m.Mark) AS 'Điểm trung bình'
FROM Student s JOIN Mark m ON s.StudentID = m.StudentID
GROUP BY s.StudentID, s.StudentName
HAVING AVG(m.Mark > 15);

SELECT S.StudentId, S.StudentName, AVG(Mark)
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName
HAVING AVG(Mark) >= ALL (SELECT AVG(Mark) FROM Mark GROUP BY Mark.StudentId);
