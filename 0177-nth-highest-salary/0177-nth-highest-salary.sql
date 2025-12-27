CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    SET n=n-1;
  RETURN (
      # Write your MySQL query statement below.
        SELECT  distinct salary  from Employee order by salary desc limit 1 offset n
  );
END