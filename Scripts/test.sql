select user(), database();

select * from department d ;
select * from title;
select * from employee e ;

select title_no, title_name from title;

-- 조민희가 로그인하려고 할경우
select emp_no, emp_name, title, manager, salary, dept, hire_date 
  from employee 
 where emp_no = 1003 and passwd = password('1234567');

select title_no, title_name from title;
select emp_no, emp_name, title, manager, salary, dept, pic, passwd, hire_date from employee;
select dept_no, dept_name, floor from department;


SELECT 
	FROM employee
	WHERE de;