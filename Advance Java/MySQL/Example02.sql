USE BANK1; /* To use the particular database. */

/* How do we create tables in database ? */
CREATE TABLE bankinfo(
		id int auto_increment,
        name varchar(225),
        branch varchar(255),
        ifsc varchar(255),
        PRIMARY KEY(id)
);

/* How do we insert data into table ? */
INSERT INTO bankinfo(id, name, branch, ifsc) VALUES (101, "BOM", "Chandur Biswa", "MAHB0001068");
INSERT INTO bankinfo(name, branch, ifsc) VALUES ("HDFC", "Amravati", "HDFC0009823"), ("Axis Bank", "Pune", "AXS000108558"),  ("SBI", "Pune", "SBI0001085");

/* How do we select all the info from table ?*/
SELECT * FROM bankinfo;

/*How do we select info from particular coloums ?*/
SELECT name, ifsc FROM bankinfo;

/* How do we use WHERE clause in SELECT query ?*/
SELECT * FROM bankinfo WHERE id = 104;

/* How do we update info in table ?
- The MySQL by default uses safe update mode to disable this we can use following query or we can define a primary key.
*/
UPDATE bankinfo SET branch = "Yerwada" WHERE id = 103;

/* Deletes all the records of the specified table. */
TRUNCATE bankinfo;

/* Deletes the table from the database. */
DROP TABLE bankinfo;
