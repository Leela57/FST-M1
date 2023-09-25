REM   Script: Acitivity1,2,3
REM   activity 1, 2 and 3 has in this

create table salesman(salesman_id int not null,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

describe salesman


INSERT ALL 
	INTO salesman values(5001,'James Hoog','New York',15) 
	INTO salesman values(5002,'Nail Knite','Paris',13) 
	INTO salesman values(5005,'Pit Alex','London',11) 
	INTO salesman values(5006,'McLyon','Paris',14) 
	INTO salesman values(5007,'Paul Adam','Rome',13) 
	INTO salesman values(5003,'Lauson Hen','San Jose',12) 
SELECT 1 from DUAL;

SELECT * from salesman;

select salesman_id salesman_city from salesman;

select salesman_id, salesman_city from salesman;

select salesman_id,salesman_name,salesman_city,commission where salesman_city = 'Paris';

select salesman_id,salesman_name,salesman_city,commission from salesman where salesman_city = 'Paris';

select salesman_id,commssion from salesman where salesman_name = 'Paul Adam';

select salesman_id,commission from salesman where salesman_name = 'Paul Adam';

select *from salesman where salesman_city = "Paris";

select *from salesman where salesman_city = 'Paris';

