SELECT c.class
FROM (
    SELECT c2.class, COUNT(c2.student) AS total_students
    FROM Courses c2
    GROUP BY c2.class
) c
WHERE c.total_students >= 5