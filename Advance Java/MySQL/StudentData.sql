CREATE DATABASE studentdao;

USE studentdao;

CREATE TABLE student_info(
	studId int primary key auto_increment,
    studName varchar(255) not null,
    address varchar(255),
    email varchar(255) not null,
    age int
);

INSERT INTO student_info(studId, studName, address, email, age) VALUES(101, "Ritesh", "Chandur Biswa", "gaygawaliriesh@gmail.com", 23);
INSERT INTO student_info(studName, address, email, age) VALUES("Harshal", "Partwada", "harshaldabhade@gmail.com", 22);

SELECT * FROM student_info;