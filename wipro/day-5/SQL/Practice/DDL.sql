create table student(
 student_id number(9) NOT NULL,
 full_name varchar(50) NOT NULL,
 email varchar2(40) DEFAULT 'test@test.com',
 registered_hours number(4),
 CONSTRAINT reg_hrs_chk CHECK (registered_hours > 0)
)

insert into student values(null, 'Sunil', 'sunil@gmail.com', 10);  -- fails
insert into student values(1, null, 'sunil@gmail.com', 10); --fails
insert into student values(1, 'Sunil', 'sunil@gmail.com', -1); --fails
insert into student values(1, 'Sunil', 'sunil@gmail.com', 10); 
insert into student(student_id,full_name,registered_hours) values(2, 'Anil', 8);

select * from student;


create table instructor(
  inst_id number(9) PRIMARY KEY,
  inst_name varchar2(50) NOT NULL,
  email varchar2(40) DEFAULT 'test@cognizant.edu' UNIQUE,
  faculty_name varchar2(40)
);

DESC instructor;

select * from user_constraints;
SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'INSTRUCTOR';

insert into instructor values(1, 'SUNIL', 'sunil@gmail.com','IT');
select * from instructor;
insert into instructor values(1, 'ANIL', 'anil@gmail.com','IT');  -- fails unique constraint (SUNIL.SYS_C008226) violated
insert into instructor values(null, 'ANIL', 'anil@gmail.com','IT'); -- fails cannot insert NULL into ("SUNIL"."INSTRUCTOR"."INST_ID")
insert into instructor values(2, 'ANIL', 'anil@gmail.com','IT');
insert into instructor values(3, 'SANJAY', 'anil@gmail.com','IT'); -- fails unique constraint (SUNIL.SYS_C008227) violated
insert into instructor values(3, 'SANJAY', null,'IT');
insert into instructor values(4, 'PRAVEEN', null,'IT');


create table dept_new(
   dept_id number(7),
   dept_name varchar2(20) NOT NULL,
   loc_id number(4),
   PRIMARY KEY(dept_id)
);

create table emp_new(
 emp_id number(7) PRIMARY KEY,
 emp_name varchar2(40) NOT NULL,
 email varchar2(60) UNIQUE,
 salary number(5) CHECK(salary BETWEEN 4000 AND 20000),
 dept_id number(7) CONSTRAINT dept_id_fk REFERENCES dept_new(dept_id) 
);

insert into dept_new values(10, 'Admin', 1001);
insert into dept_new values(20, 'Marketing', 1001);

select * from dept_new;

insert into emp_new values(1, 'SUNIL','sunil@gmail.com', 5000, 30); -- fails integrity constraint (SUNIL.DEPT_ID_FK) violated - parent key not found
insert into emp_new values(1, 'SUNIL','sunil@gmail.com', 5000, 10); --correct
insert into emp_new values(2, 'ANIL','anil@gmail.com', 5000, null); -- correct

drop table dept_new; -- fails
delete from emp_new where dept_id=10;
drop table dept_new;
select * from emp_new;
select * from user_constraints where table_name='EMP_NEW';
ALTER TABLE EMP_NEW DROP CONSTRAINT DEPT_ID_FK;
drop table dept_new;


create table emp_new2(
 emp_id number(7) PRIMARY KEY,
 emp_name varchar2(40) NOT NULL,
 email varchar2(60) UNIQUE,
 salary number(5) CHECK(salary BETWEEN 4000 AND 20000),
 dept_id number(7) CONSTRAINT dept_id_fk REFERENCES dept_new(dept_id) 
 ON DELETE CASCADE);
 
insert into emp_new2 values(1, 'SUNIL','sunil@gmail.com', 5000, 10); --correct
insert into emp_new2 values(2, 'ANIL','anil@gmail.com', 5000, 10); -- correct

select * from emp_new2;

delete from dept_new where dept_id=10;

--- create table with subquery
-- syntax: CREATE TABLE <table_name>[(column_name_1, column_name2,....)] AS subquery

create table emp_copy AS select * from emp_new2;
select * from emp_copy;   
select * from emp_new2; 

desc dept_new;

create table dept_copy(department_id, department_name,location_id) AS select * from dept_new;
select * from dept_new;
select * from dept_copy;

-- ALTER TABLE

desc emp_copy;
ALTER TABLE emp_copy ADD (manager_id number(7));
desc emp_copy;
ALTER TABLE emp_copy DROP (manager_id);
desc emp_copy;

describe dept_copy;
ALTER TABLE dept_copy MODIFY (department_name varchar2(25));
describe dept_copy;

ALTER TABLE dept_copy RENAME COLUMN department_name TO dept_name;
describe dept_copy;

select * from dept_copy;
insert into dept_copy values(30,'Sales',1001);

ALTER TABLE dept_copy READ ONLY;
insert into dept_copy values(40,'Shipping',1001); -- fails

ALTER TABLE dept_copy READ WRITE;
insert into dept_copy values(40,'Shipping',1001);

drop table instructor;
-- check in Recycle Bin in SQL Developer , flash back to before drop
drop table instructor PURGE;


select * from emp;
insert into emp values (2, 'Anil', '10-July-2020', 10);

select emp_id, last_name, to_char(hire_date, 'DD/MM/YYYY'), dept_id from emp;
select to_char(hire_date, 'MM/DD/YYYY') from emp;
select to_char(hire_date, 'MM/DD/RR') from emp;
select to_char(hire_date, 'YYYY/MM/DD') from emp;