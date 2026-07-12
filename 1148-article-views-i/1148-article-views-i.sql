-- Write your PostgreSQL query statement below
SELECT DISTINCT v.author_id as id
FROM Views v
WHERE v.viewer_id = v.author_id
ORDER BY ID ASC