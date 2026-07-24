# Write your MySQL query statement below
select p.id as id
from Weather p
cross join Weather q
where DATEDIFF(p.recordDate,q.recordDate)=1 and p.temperature>
q.temperature;