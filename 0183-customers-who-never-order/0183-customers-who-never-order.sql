# Write your MySQL query statement below
SELECT name customers from customers where id not in(select customerId from orders);