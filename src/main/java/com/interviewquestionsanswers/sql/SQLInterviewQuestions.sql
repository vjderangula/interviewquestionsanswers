select max(salary) from employee where salary <(select max(salary) from employee);

select name from employee where name like 'j%';



write a query to find each state how many number of male and female users available?
SELECT state,gender,COUNT(*) AS user_count FROM User u JOIN Address a ON u.id = a.user_id GROUP BY state, gender;

