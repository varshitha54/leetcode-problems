# Write your MySQL query statement below
SELECT p.project_id,round(avg(experience_years),2)  as average_years from employee e,project p where p.employee_id=e.employee_id group by project_id;