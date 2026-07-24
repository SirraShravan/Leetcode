# Write your MySQL query statement below
select e1.name,e2.bonus
from employee e1
left join Bonus e2
on e1.empid=e2.empid
where e2.bonus<1000 or e2.bonus is null;