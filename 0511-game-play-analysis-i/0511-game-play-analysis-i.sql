-- Write your PostgreSQL query statement below
-- SELECT a.player_id, a.event_date as first_login
-- FROM Activity a
-- WHERE a.event_date = (
--     SELECT MIN(a2.event_date)
--     FROM Activity a2
--     WHERE a2.player_id = a.player_id
-- )


SELECT a.player_id, MIN(a.event_date) as first_login
FROM Activity a
GROUP BY a.player_id