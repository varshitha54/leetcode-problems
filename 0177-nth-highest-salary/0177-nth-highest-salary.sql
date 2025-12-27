CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    DECLARE X INT DEFAULT N-1;
  RETURN (
      # Write your MySQL query statement below.
        SELECT  distinct salary  from Employee order by salary desc limit 1 offset X
  );
END