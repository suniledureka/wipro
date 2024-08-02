select employee_id, last_name, job_id, hire_date, department_id from employees;

SELECT
    employee_id,
    last_name,
    job_id,
    hire_date,
    department_id
FROM
    employees;
    
SELECT
    department_id,
    department_name
FROM
    departments;  
    
select * from regions;

select last_name, salary, department_id, salary*12, commission_pct, commission_pct*salary from employees;

select last_name AS NAME, job_id, hire_date  "START DATE", employee_id from employees;

select last_name ||' ' || first_name as "FULL NAME", salary , department_id from employees;

select last_name, 1000 as "Col1", 'This is test' "Col2" from employees;  --- 1000 is a literal, Col1 and Col2 are column names

select last_name || ' earns monthly salary of Rs.' || salary ||' and an Annual Salary of Rs.' || salary * 12 as "Employee Salary Details" from employees; 

select DISTINCT department_id, department_name from departments;

select DISTINCT job_id from employees;

DESCRIBE locations;


select last_name, department_id from employees where employee_id=176;

select last_name, salary from employees where salary > 16000;

select last_name, salary from employees where salary >= 11000 and salary <=14000;
select last_name, salary from employees where salary BETWEEN 11000 AND 14000;

select last_name, salary, commission_pct from employees where commission_pct IS NOT NULL;

select department_id, manager_id, location_id from departments where department_id IN (10,20, 50); 

select * from employees where first_name LIKE 'M%';
select last_name, department_id from employees where last_name LIKE '__s%';

select first_name || ' ' ||last_name AS "Full Name", hire_date, department_id from employees where hire_date >= '01-Jan-2008' and hire_date <= '31-dec-2008';
select first_name || ' ' ||last_name AS "Full Name", hire_date, department_id from employees where hire_date BETWEEN '01-Jan-2008' AND '31-dec-2008';

--- logical operators  --> AND , OR,  NOT and precedence is NOT, AND, OR

select last_name, job_id, salary from employees where job_id='IT_PROG' AND salary NOT IN (4200, 4800);

select * from employees where department_id=90;
select * from employees where department_id=90 ORDER BY salary;
select * from employees where department_id=90 ORDER BY salary DESC;

select location_id, street_address, city from locations ORDER BY 1;
select location_id, street_address, city from locations ORDER BY 1 DESC;

select employee_id, last_name, department_id, salary from employees where department_id IN(10,40,90)
   ORDER BY department_id DESC, salary, employee_id DESC;
   
-- Row Limiting Clause   
select employee_id, last_name, salary from employees ORDER BY salary DESC;
select employee_id, last_name, salary from employees ORDER BY salary DESC FETCH FIRST 10 ROWS ONLY;
select employee_id, last_name, salary from employees ORDER BY salary DESC OFFSET 4 ROWS FETCH NEXT 5 ROWS ONLY;
select employee_id, last_name, salary from employees ORDER BY salary DESC FETCH FIRST 5 PERCENT ROWS ONLY;  
select employee_id, last_name, salary from employees ORDER BY salary DESC OFFSET 4 ROWS FETCH FIRST 2 PERCENT ROWS ONLY;   

select department_id, department_name from departments where location_id=1700 ORDER BY department_id ASC OFFSET 3 ROWS FETCH NEXT 4 ROWS ONLY;


REM Substitution Variables

select last_name, job_id, salary, department_id from employees where department_id=&deptid;

select location_id, street_address, city from locations where city like '%&city_portion%';

select last_name, salary, &column from employees;

select last_name, salary, &column from employees where &column=60;

select last_name, salary, &&column from employees where &column=60;





















    