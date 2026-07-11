-- Write your PostgreSQL query statement below
SELECT MAX(mn.num) as num
FROM (
    SELECT mn1.num, COUNT(mn1.num) as total_counts
    FROM MyNumbers mn1
    GROUP BY mn1.num
) as mn
WHERE mn.total_counts = 1