-- Write your PostgreSQL query statement below
SELECT q.query_name, 
    ROUND(AVG(q.rating::numeric / q.position ), 2) as quality,
    ROUND(AVG(
        CASE
            WHEN q.rating < 3 THEN 1::numeric
            ELSE 0::numeric
        END
    ) * 100, 2) as poor_query_percentage
FROM Queries q
GROUP BY q.query_name