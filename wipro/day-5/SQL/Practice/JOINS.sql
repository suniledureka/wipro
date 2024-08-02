REM Inner Join - Natural Join
select department_id, department_name,location_id, city from departments NATURAL JOIN locations; -- here Oracle will join departments table and locations table with the common data - location_id

-- practice

select department_name, city, street_address, country_name from departments 
 NATURAL JOIN locations
 NATURAL JOIN countries;
 
select last_name, department_id, job_id, job_title from employees NATURAL JOIN jobs WHERE department_id IN(10,90,20);

REM Inner Join - USING Clause

select department_id, department_name,location_id, city from departments JOIN locations USING (location_id) order by 1;

select last_name, salary, department_name from employees JOIN departments USING (department_id) order by department_id;

-- Practice

select department_name, city, street_address, country_name from departments JOIN locations USING (location_id)
JOIN countries USING (country_id)

select last_name, department_id,job_id, job_title from employees JOIN jobs USING (job_id) where department_id IN(10,90,20);

select country_id, country_name, region_name from countries JOIN regions USING (region_id);

REM Inner Join - ON Clause

select department_id, department_name, city from departments JOIN locations ON (departments.location_id = locations.location_id) order by department_id;

select last_name, salary, department_name from employees JOIN departments ON (employees.department_id = departments.department_id) order by department_id; -- error column ambiguously defined
select last_name, salary, department_name from employees JOIN departments ON (employees.department_id = departments.department_id) order by departments.department_id;
select last_name, salary, department_name from employees e JOIN departments d ON (e.department_id = d.department_id) order by d.department_id;

select last_name, job_id, job_title from employees JOIN jobs ON (employees.job_id = jobs.job_id); -- column ambiguously defined
select last_name, employees.job_id, job_title from employees JOIN jobs ON (employees.job_id = jobs.job_id);
select e.last_name, e.job_id, j.job_title from employees e JOIN jobs j ON (e.job_id = j.job_id); -- using table aliases

-- Practice
select e.last_name, e.department_id, d.department_name,l.city  from employees e 
JOIN departments d ON (d.department_id = e.department_id)
JOIN locations l ON (l.location_id = d.location_id) AND l.city = 'London'

select e.last_name, e.department_id, d.department_name,l.city  from employees e 
JOIN departments d ON (d.department_id = e.department_id)
JOIN locations l ON (l.location_id = d.location_id) AND l.city = 'Oxford'

REM Inner Join - Self Join
select employee_id, last_name, manager_id from employees;
select employee_id, last_name from employees;

select e.employee_id, e.last_name, m.last_name from employees e JOIN employees m ON (e.manager_id = m.employee_id);

--practice
select e.employee_id, e.last_name, m.last_name, m.phone_number from employees e JOIN employees m ON (e.manager_id = m.employee_id);

select job_id,min(salary), max(salary) from employees e GROUP BY (job_id) order by 2; 
select last_name,salary from employees;
create table JOB_GRADES(grade_level varchar2(1), min_sal number(6), max_sal number(6));
commit;
insert into JOB_GRADES values('D',9001,50000);
select * from job_grades;
update job_grades set grade_level='B' where min_sal=4201;

select e.last_name, e.department_id, e.salary, jd.grade_level from employees e JOIN job_grades jd ON e.salary BETWEEN jd.min_sal AND jd.max_sal;

REM OUTER JOINS
SELECT last_name, department_id FROM employees order by 2;
SELECT department_id, department_name from departments order by 1;

select e.last_name, e.department_id, d.department_name from employees e 
  JOIN departments d
  ON e.department_id = d.department_id order by 1;  -- only matching records of both the tables

select e.last_name, e.department_id, d.department_name from employees e 
  LEFT OUTER JOIN departments d
  ON e.department_id = d.department_id order by 2;
  
select e.last_name, d.department_id, d.department_name from employees e 
  RIGHT OUTER JOIN departments d
  ON e.department_id = d.department_id order by 2;  

select e.last_name, d.department_id, d.department_name from employees e 
  FULL OUTER JOIN departments d
  ON e.department_id = d.department_id order by 2;  

Practice

select city, country_name from locations JOIN countries  ON (locations.country_id = countries.country_id)

select city, country_name from locations LEFT OUTER JOIN countries  ON (locations.country_id = countries.country_id)

select city, country_name from locations RIGHT OUTER JOIN countries  ON (locations.country_id = countries.country_id)

select city, country_name from locations FULL OUTER JOIN countries  ON (locations.country_id = countries.country_id)

REM Cartesian Join / Cross Joim
select count(*) from employees;
select count(*) from countries;
select last_name from employees
select country_name from countries;
select last_name, country_name from employees CROSS JOIN countries;

select * from regions cross join countries

REM UB QUERIES
select last_name, salary from employees where last_name LIKE ('Chen');

select last_name, salary from employees where salary > (select salary from employees where last_name = 'Chen')
select last_name, salary from employees where salary >= (select avg(salary) from employees);
