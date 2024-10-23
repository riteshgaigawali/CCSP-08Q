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
INSERT INTO student_info(studName, address, email, age) VALUES("Aniket", "Buldhana", "aniketrathod@gmail.com", 22);

SELECT * FROM student_info;

DELIMITER $$
	CREATE PROCEDURE getAddressCount(
		IN stud_address varchar(255),
		OUT stud_count int
	)
	BEGIN
		SELECT count(*) INTO stud_count
        FROM student_info
        WHERE address = stud_address;
END $$

DELIMITER $$
	CREATE PROCEDURE getNameCount(
		IN stud_name varchar(255),
		OUT stud_count int
	)
	BEGIN
		SELECT count(*) INTO stud_count
        FROM student_info
        WHERE studName = stud_name;
END $$

DELIMITER $$
	CREATE PROCEDURE getStudAddress(
		IN stud_name varchar(255),
		OUT stud_address varchar(255)
	)
	BEGIN
		SELECT address INTO stud_address
        FROM student_info
        WHERE studName = stud_name;
END $$




