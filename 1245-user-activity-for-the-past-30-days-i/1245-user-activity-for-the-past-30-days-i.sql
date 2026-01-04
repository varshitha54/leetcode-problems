# Write your MySQL query statement below
SELECT ACTIVITY_DATE AS DAY ,COUNT(distinct USER_ID) AS ACTIVE_USERS from activity WHERE ACTIVITY_DATE BETWEEN "2019-06-28" AND "2019-07-27" GROUP BY activity_date;
