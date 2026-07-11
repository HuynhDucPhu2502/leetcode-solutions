-- Write your PostgreSQL query statement below
SELECT sp1.name
FROM SalesPerson sp1
WHERE sp1.sales_id NOT IN (
    SELECT DISTINCT(sp.sales_id)
    FROM SalesPerson sp 
    LEFT JOIN Orders o
        ON o.sales_id = sp.sales_id
    LEFT JOIN Company c
        ON c.com_id = o.com_id
    WHERE c.name = 'RED'
)