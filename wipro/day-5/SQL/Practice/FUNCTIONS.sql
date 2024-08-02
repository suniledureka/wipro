select UPPER(first_name), LOWER(last_name), INITCAP('this is a test string') from employees where department_id=90;

select last_name AS "NAME", department_id "DEPT ID" from employees where last_name LIKE 'A%' ORDER BY last_name;

select last_name AS "NAME", department_id "DEPT ID" from employees where last_name LIKE '&name_starts_with%' ORDER BY last_name;

select last_name, first_name, CONCAT(CONCAT(first_name, ' '), last_name) "FULL NAME" from employees where department_id=60;

select last_name, SUBSTR(last_name,1,4) "Partial Name", SUBSTR(last_name,-2,2) "Last 2 Chars", LENGTH(last_name) "NAME SIZE", INSTR(last_name,'s') "Index of S" from employees where department_id=60;

select last_name , LPAD(last_name, 10, '*') "LPAD", RPAD(last_name, 10, '*'), TRIM('   Cognizant    Technologies     '), REPLACE(last_name, 'no','**') "REPLACE" from employees where department_id=60;

select department_id, department_name, LENGTH(department_name) "LENGTH" , SUBSTR(department_name,-4) "LAST 4 CHARS" from departments where location_id=1700 ORDER BY 3 DESC;

select country_id "CID", country_name "CNAME", REPLACE(country_name,SUBSTR(country_name,1,2),'**') "REPLACE" from countries;

select first_name, last_name , CONCAT(SUBSTR(first_name,1,2), SUBSTR(last_name,-2)) from employees;

desc dual;
select ceil(76.878), floor(76.878) from DUAL;
select trunc(76.878,2), trunc(76.878), trunc(76.878,-1), trunc(76.878,-2) from dual;
select mod(10,3) from dual;
select round(76.878, 2), round(76.878, 0),round(76.878, -1) from dual;

select employee_id, last_name, salary, ROUND((salary + salary*10/100), 0) "NEW SALARY" from employees where department_id=100 ORDER BY &order_column;

select SYSDATE, CURRENT_DATE, CURRENT_TIMESTAMP from DUAL;

select SYSDATE, ROUND(SYSDATE, 'MONTH') , ROUND(SYSDATE, 'YEAR'), TRUNC(SYSDATE, 'YEAR') from DUAL;

select SYSDATE, ADD_MONTHS(SYSDATE, 6) , NEXT_DAY(SYSDATE, 'Friday'), LAST_DAY(SYSDATE), MONTHS_BETWEEN('01-JUL-22', SYSDATE) from DUAL;

select last_name, department_id, hire_date, (sysdate - hire_date) "WORKING DAYS" from employees;

select SYSDATE, SYSDATE-1, SYSDATE+1 from DUAL;



