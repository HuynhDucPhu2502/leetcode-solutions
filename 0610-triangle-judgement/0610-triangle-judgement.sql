-- Write your PostgreSQL query statement below
SELECT t.x, t.y, t.z,
    CASE
        WHEN t.x + t.y <= t.z THEN 'No'
        WHEN t.x + t.z <= t.y THEN 'No'
        WHEN t.y + t.z <= t.x THEN 'No'
        ELSE 'Yes'
    END triangle
FROM Triangle t