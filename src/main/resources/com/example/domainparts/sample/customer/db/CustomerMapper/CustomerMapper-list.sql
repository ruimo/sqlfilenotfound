select *
from customer
where 1 = 1
  /*[# th:if="${firstName}!=null"]*/
    and first_name Like  /*[# mb:p="firstName"]*/ 'Mary' /*[/]*/
  /*[/]*/
  /*[# th:if="${lastName}!=null"]*/
    and last_name Like /*[# mb:p="lastName"]*/ 'Smith' /*[/]*/
  /*[/]*/
order by customer_id