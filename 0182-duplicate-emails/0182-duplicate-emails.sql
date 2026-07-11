-- Write your PostgreSQL query statement below
SELECT p.email as Email
FROM Person p 
GROUP BY p.email
HAVING COUNT(p.email) > 1