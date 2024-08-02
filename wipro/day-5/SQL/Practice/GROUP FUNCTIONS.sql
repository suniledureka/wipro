select salary from employees;
select salary from employees order by 1;
select min(salary) , max(salary) from employees;
select min(salary) , max(salary) from employees where department_id=90;
select count(*) from employees;
select count(employee_id) from employees;
select sum(salary), avg(salary) from employees;

-- practice
select salary from employees where department_id=100 order by 1;
select max(salary) "MAX SAL", min(salary) "MIN SAL", sum(salary) AS "TOTAL", round(avg(salary),2) "AVERAGE" from employees where department_id=100;

select department_id, department_name from departments where location_id=1700;
select count(department_id) from departments where location_id=1700;

select state_province from locations;
select count(state_province) from locations; -- null values are not considered

REM   --- DISTINCT and NULL Values in Group Functions ---
select job_id from employees;
select DISTINCT job_id from employees;

select count(job_id) from employees;
select count(DISTINCT job_id) from employees;

select commission_pct from employees;
select commission_pct from employees where commission_pct is not null;
select count(commission_pct) from employees; -- not considering NULL values -- 35

select NVL(commission_pct,0) from employees;
select count(NVL(commission_pct,0)) from employees; -- 107

select sum(commission_pct), count(commission_pct) , sum(commission_pct)/count(commission_pct), avg(commission_pct) from employees;

select sum(commission_pct), count(NVL(commission_pct,0)) , sum(commission_pct)/count(NVL(commission_pct,0)), avg(commission_pct), avg(NVL(commission_pct,0)) from employees;

-- practice
select department_id from employees;
select count(department_id) from employees; -- counts all department ids including duplicates and excludes null
select count(DISTINCT department_id) from employees;
select count(DISTINCT (department_id)) from employees;

select location_id from departments;
select count(DISTINCT location_id) from departments;

select manager_id from employees;
select DISTINCT manager_id from employees;
select count(manager_id) from employees;
select count(distinct manager_id) "NO OF MANAGERS" from employees;


REM Using GROUP BY Clause

select department_id, salary from employees;
select department_id, count(employee_id) "NO OF EMPLOYEES" from employees GROUP BY department_id ORDER BY 1;
select department_id, max(salary) "MAX SALARY" from employees GROUP BY department_id order by department_id;
select JOB_ID, MIN(salary), MAX(salary) , AVG(salary) from employees GROUP BY JOB_ID order by 2;

select department_id, JOB_ID, count(employee_id) from employees GROUP BY department_id, JOB_ID order by 1;

-- practice
select job_id "JOB", count(*) "No of Emps" from employees group by job_id order by 2 DESC;

select department_id, location_id from departments;
select location_id, count(department_id) "No of Depts" from departments group by location_id

select job_id, department_id, count(*) "NO OF EMPS", sum(salary), avg(salary), min(salary), max(salary) from employees group by job_id, department_id;

select department_id, salary from employees;
select department_id, max(salary) from employees group by department_id HAVING max(salary) > 10000;

select department_id, SUM(salary) from employees where department_id IN (80,90,100) GROUP BY department_id HAVING SUM(salary) > 52000 order by 2;

select region_id, count(country_id) from countries group by region_id having count(country_id)>5 order by 2;


select job_id, sum(salary) "TOTAL SALARY" from employees WHERE department_id IN(50,80) GROUP BY JOB_ID HAVING SUM(salary)>=60000











