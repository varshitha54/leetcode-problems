# Write your MySQL query statement belose
select email Email from person group by email  having count(email)>1;