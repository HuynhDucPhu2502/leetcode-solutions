-- Write your PostgreSQL query statement below
SELECT  o.customer_number
FROM (
    SELECT o2.customer_number, COUNT(o2.order_number) as total_orders
    FROM Orders o2
    GROUP BY o2.customer_number
) o
WHERE o.total_orders = (
    SELECT MAX(o3.total_orders) 
    FROM (
        SELECT o3.customer_number, count(o3.order_number) as total_orders
        FROM Orders o3
        GROUP BY o3.customer_number
    ) o3
)