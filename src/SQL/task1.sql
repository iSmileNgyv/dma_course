INSERT INTO student (name, age, subject) VALUES('John Doe', 22, 'Computer Science');
INSERT INTO student (name, age, subject) VALUES('Jane Smith', 20, 'Mathematics');


SELECT * FROM student;

SELECT * FROM student WHERE subject = 'Mathematics';

UPDATE student SET age = 23 WHERE name = 'John Doe';

DELETE FROM student WHERE age = 20;

SELECT * FROM student ORDER BY age DESC;

SELECT * FROM student WHERE age > 21;

SELECT avg(age) as average FROM student;

SELECT COUNT(*) as cnt FROM student;