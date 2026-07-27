# Write your MySQL query statement below
select S.name
from SalesPerson S
where sales_id not in(
    select o.sales_id
    from orders o
    join Company c
    on c.com_id=o.com_id
    where c.name='RED'
);