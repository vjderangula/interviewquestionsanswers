select max(salary) from employee where salary <(select max(salary) from employee);

select name from employee where name like 'j%';