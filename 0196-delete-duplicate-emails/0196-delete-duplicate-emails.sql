-- Write your PostgreSQL query statement below
-- DELETE FROM Person p
-- USING Person p2
-- WHERE p.email = p2.email
--     AND p.id > p2.id


DELETE FROM Person p
WHERE p.id NOT IN (
    SELECT MIN(p2.id)
    FROM Person p2
    GROUP BY p2.email
)